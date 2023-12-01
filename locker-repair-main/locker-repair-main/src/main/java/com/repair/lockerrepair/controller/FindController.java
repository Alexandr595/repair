package com.repair.lockerrepair.controller;

import com.repair.lockerrepair.dto.FindingDTO;
import com.repair.lockerrepair.model.AnnualPeriod;
import com.repair.lockerrepair.service.FindingService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FindController {

    private final FindingService findingService;

    public FindController(FindingService findingService) {
        this.findingService = findingService;
    }

    @PostMapping("/find")
    public List<AnnualPeriod> find(@RequestBody FindingDTO dto) {
        return findingService.findByMask(dto);
    }
}
