package com.repair.lockerrepair.service;

import com.repair.lockerrepair.model.RepairObject;
import com.repair.lockerrepair.model.RepairOrder;
import com.repair.lockerrepair.service.common.DefaultServiceImplementation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class RepairObjectService extends DefaultServiceImplementation<RepairObject, Long> {
    public RepairObjectService(CrudRepository<RepairObject, Long> repo) {
        super(repo);
    }

    public RepairObject appendRepairOrder(Long repairObjectId, RepairOrder repairOrder) {
        RepairObject repairObject = repo.findById(repairObjectId).orElseThrow();
        repairObject.getRepairOrders().add(repairOrder);
        return repo.save(repairObject);
    }
}
