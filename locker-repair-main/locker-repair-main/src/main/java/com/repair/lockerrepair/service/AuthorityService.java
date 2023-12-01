package com.repair.lockerrepair.service;

import com.repair.lockerrepair.dto.User;
import org.springframework.stereotype.Service;

@Service
public class AuthorityService {
    public String getRole(User user) {
        if (user.getLogin().equals("admin") && user.getPassword().equals("admin")) {
            return "ADMIN";
        }
        if (user.getLogin().equals("user") && user.getPassword().equals("user")) {
            return "USER";
        }
        return "NONE";
    }
}
