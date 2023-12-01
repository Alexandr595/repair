package com.repair.lockerrepair.service;

import com.repair.lockerrepair.model.Part;
import com.repair.lockerrepair.service.common.CrudService;
import com.repair.lockerrepair.service.common.DefaultServiceImplementation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class PartService extends DefaultServiceImplementation<Part, Long> implements CrudService<Part, Long> {
    public PartService(CrudRepository<Part, Long> repo) {
        super(repo);
    }
}
