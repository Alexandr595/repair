package com.repair.lockerrepair.controller;

import com.repair.lockerrepair.controller.common.CrudController;
import com.repair.lockerrepair.model.RepairObject;
import com.repair.lockerrepair.model.RepairOrder;
import com.repair.lockerrepair.service.RepairObjectService;
import com.repair.lockerrepair.service.common.CrudService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/repairObject")
public class RepairObjectController extends CrudController<RepairObject, Long> {

    private final RepairObjectService repairObjectService;

    public RepairObjectController(CrudService<RepairObject, Long> service) {
        super(service);
        repairObjectService = (RepairObjectService) service;
    }

    @PostMapping("/{id}/appendRepairOrder")
    public RepairObject appendRepairOrder(@PathVariable Long id, @RequestBody RepairOrder repairOrder) {
        return repairObjectService.appendRepairOrder(id, repairOrder);
    }
}
