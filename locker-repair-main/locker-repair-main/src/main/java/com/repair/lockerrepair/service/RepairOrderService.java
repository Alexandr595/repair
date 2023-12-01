package com.repair.lockerrepair.service;

import com.repair.lockerrepair.model.Locker;
import com.repair.lockerrepair.model.RepairOrder;
import com.repair.lockerrepair.service.common.DefaultServiceImplementation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class RepairOrderService extends DefaultServiceImplementation<RepairOrder, Long> {
    public RepairOrderService(CrudRepository<RepairOrder, Long> repo) {
        super(repo);
    }

    public RepairOrder appendLocker(Long repairOrderId, Locker locker) {
        RepairOrder repairOrder = repo.findById(repairOrderId).orElseThrow();
        repairOrder.getLockers().add(locker);
        return repo.save(repairOrder);
    }
}
