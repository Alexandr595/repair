package com.repair.lockerrepair.controller;

import com.repair.lockerrepair.controller.common.CrudController;
import com.repair.lockerrepair.model.EquipmentType;
import com.repair.lockerrepair.model.Part;
import com.repair.lockerrepair.service.EquipmentTypeService;
import com.repair.lockerrepair.service.common.CrudService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/equipmentType")
public class EquipmentTypeController extends CrudController<EquipmentType, Long> {

    private final EquipmentTypeService equipmentTypeService;

    public EquipmentTypeController(CrudService<EquipmentType, Long> service) {
        super(service);
        equipmentTypeService = (EquipmentTypeService) service;
    }

    @PostMapping("/{id}/appendPart")
    public EquipmentType appendPart(@PathVariable Long id, @RequestBody Part part) {
        return equipmentTypeService.appendAppendPart(id, part);
    }
}
