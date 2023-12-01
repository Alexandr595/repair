package com.repair.lockerrepair.controller;

import com.repair.lockerrepair.controller.common.CrudController;
import com.repair.lockerrepair.model.EquipmentType;
import com.repair.lockerrepair.model.Locker;
import com.repair.lockerrepair.model.RepairRequest;
import com.repair.lockerrepair.service.LockerService;
import com.repair.lockerrepair.service.common.CrudService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/locker")
public class LockerController extends CrudController<Locker, Long> {

    private final LockerService lockerService;

    public LockerController(CrudService<Locker, Long> service) {
        super(service);
        lockerService = (LockerService) service;
    }

    @PostMapping("/{id}/appendEquipmentType")
    public Locker appendEquipmentType(@PathVariable Long id, @RequestBody EquipmentType equipmentType) {
        return lockerService.appendEquipmentType(id, equipmentType);
    }

    @PostMapping("/{id}/appendRepairRequest")
    public Locker appendRepairRequest(@PathVariable Long id, @RequestBody RepairRequest repairRequest) {
        return lockerService.appendRepairRequest(id, repairRequest);
    }
}
