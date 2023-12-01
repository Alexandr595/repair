package com.repair.lockerrepair.service;

import com.repair.lockerrepair.model.AnnualPeriod;
import com.repair.lockerrepair.model.Customer;
import com.repair.lockerrepair.service.common.DefaultServiceImplementation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class AnnualPeriodService extends DefaultServiceImplementation<AnnualPeriod, Long> {
    public AnnualPeriodService(CrudRepository<AnnualPeriod, Long> repo) {
        super(repo);
    }

    public AnnualPeriod appendCustomer(Long annualPeriodId, Customer customer) {
        AnnualPeriod annualPeriod = repo.findById(annualPeriodId).orElseThrow();
        annualPeriod.getCustomers().add(customer);
        return repo.save(annualPeriod);
    }
}
