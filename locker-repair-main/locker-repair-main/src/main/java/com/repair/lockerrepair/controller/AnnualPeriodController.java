package com.repair.lockerrepair.controller;

import com.repair.lockerrepair.controller.common.CrudController;
import com.repair.lockerrepair.model.AnnualPeriod;
import com.repair.lockerrepair.model.Customer;
import com.repair.lockerrepair.service.AnnualPeriodService;
import com.repair.lockerrepair.service.common.CrudService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/annualPeriod")
public class AnnualPeriodController extends CrudController<AnnualPeriod, Long> {

    private final AnnualPeriodService annualPeriodService;

    public AnnualPeriodController(CrudService<AnnualPeriod, Long> service) {
        super(service);
        annualPeriodService = (AnnualPeriodService) service;
    }

    @PostMapping("/{id}/appendCustomer")
    public AnnualPeriod appendCustomer(@PathVariable Long id, @RequestBody Customer customer) {
        return annualPeriodService.appendCustomer(id, customer);
    }
}
