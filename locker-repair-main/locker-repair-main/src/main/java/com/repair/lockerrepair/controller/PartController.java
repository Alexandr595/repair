package com.repair.lockerrepair.controller;

import com.repair.lockerrepair.controller.common.CrudController;
import com.repair.lockerrepair.model.Part;
import com.repair.lockerrepair.service.common.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/part")
public class PartController extends CrudController<Part, Long> {
    public PartController(CrudService<Part, Long> service) {
        super(service);
    }
}
