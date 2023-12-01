package com.repair.lockerrepair.controller;

import com.repair.lockerrepair.controller.common.CrudController;
import com.repair.lockerrepair.model.Locker;
import com.repair.lockerrepair.model.RepairOrder;
import com.repair.lockerrepair.service.RepairOrderService;
import com.repair.lockerrepair.service.common.CrudService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/repairOrder")
public class RepairOrderController extends CrudController<RepairOrder, Long> {

    private final RepairOrderService repairOrderService;

    public RepairOrderController(CrudService<RepairOrder, Long> service) {
        super(service);
        repairOrderService = (RepairOrderService) service;
    }

    @PostMapping("/{id}/appendLocker")
    public RepairOrder appendLocker(@PathVariable Long id, @RequestBody Locker locker) {
        return repairOrderService.appendLocker(id, locker);
    }
}
