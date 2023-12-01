package com.repair.lockerrepair.controller;

import com.repair.lockerrepair.dto.User;
import com.repair.lockerrepair.service.AuthorityService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetRoleController {

    private final AuthorityService authorityService;

    public GetRoleController(AuthorityService authorityService) {
        this.authorityService = authorityService;
    }

    @PostMapping("/getRole")
    public String getRole(@RequestBody User user) {
        return authorityService.getRole(user);
    }

}
