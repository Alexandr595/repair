package com.repair.lockerrepair.service;

import com.repair.lockerrepair.model.RepairRequest;
import com.repair.lockerrepair.service.common.CrudService;
import com.repair.lockerrepair.service.common.DefaultServiceImplementation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class RepairRequestService extends DefaultServiceImplementation<RepairRequest, Long> implements CrudService<RepairRequest, Long> {
    public RepairRequestService(CrudRepository<RepairRequest, Long> repo) {
        super(repo);
    }
}
