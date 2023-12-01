package com.repair.lockerrepair.controller;

import com.repair.lockerrepair.controller.common.CrudController;
import com.repair.lockerrepair.model.Customer;
import com.repair.lockerrepair.model.RepairObject;
import com.repair.lockerrepair.service.CustomerService;
import com.repair.lockerrepair.service.common.CrudService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController extends CrudController<Customer, Long> {

    private final CustomerService customerService;

    public CustomerController(CrudService<Customer, Long> service) {
        super(service);
        customerService = (CustomerService) service;
    }

    @PostMapping("/{id}/appendRepairObject")
    public Customer appendRepairObject(@PathVariable Long id, @RequestBody RepairObject repairObject) {
        return customerService.appendRepairObject(id, repairObject);
    }
}
