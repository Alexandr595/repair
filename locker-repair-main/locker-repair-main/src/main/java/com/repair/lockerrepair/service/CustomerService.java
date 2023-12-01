package com.repair.lockerrepair.service;

import com.repair.lockerrepair.model.Customer;
import com.repair.lockerrepair.model.RepairObject;
import com.repair.lockerrepair.service.common.DefaultServiceImplementation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService extends DefaultServiceImplementation<Customer, Long> {
    public CustomerService(CrudRepository<Customer, Long> repo) {
        super(repo);
    }

    public Customer appendRepairObject(Long customerId, RepairObject repairObject) {
        Customer customer = repo.findById(customerId).orElseThrow();
        customer.getRepairObjects().add(repairObject);
        return repo.save(customer);
    }
}
