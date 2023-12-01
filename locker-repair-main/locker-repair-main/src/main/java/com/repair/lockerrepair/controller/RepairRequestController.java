package com.repair.lockerrepair.controller;

import com.repair.lockerrepair.controller.common.CrudController;
import com.repair.lockerrepair.model.RepairRequest;
import com.repair.lockerrepair.service.common.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/repairRequest")
public class RepairRequestController extends CrudController<RepairRequest, Long> {
    public RepairRequestController(CrudService<RepairRequest, Long> service) {
        super(service);
    }
}
