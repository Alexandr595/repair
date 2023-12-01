package com.repair.lockerrepair.service;

import com.repair.lockerrepair.model.EquipmentType;
import com.repair.lockerrepair.model.Locker;
import com.repair.lockerrepair.model.RepairRequest;
import com.repair.lockerrepair.service.common.CrudService;
import com.repair.lockerrepair.service.common.DefaultServiceImplementation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class LockerService extends DefaultServiceImplementation<Locker, Long> implements CrudService<Locker, Long> {
    public LockerService(CrudRepository<Locker, Long> repo) {
        super(repo);
    }

    public Locker appendEquipmentType(Long lockerId, EquipmentType equipmentType) {
        Locker locker = repo.findById(lockerId).orElseThrow();
        locker.getEquipmentTypes().add(equipmentType);
        return repo.save(locker);
    }

    public Locker appendRepairRequest(Long lockerId, RepairRequest repairRequest) {
        Locker locker = repo.findById(lockerId).orElseThrow();
        locker.getRepairRequests().add(repairRequest);
        return repo.save(locker);
    }
}
