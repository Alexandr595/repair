package com.repair.lockerrepair.service;

import com.repair.lockerrepair.model.EquipmentType;
import com.repair.lockerrepair.model.Part;
import com.repair.lockerrepair.repository.EquipmentTypeRepository;
import com.repair.lockerrepair.service.common.CrudService;
import com.repair.lockerrepair.service.common.DefaultServiceImplementation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class EquipmentTypeService extends DefaultServiceImplementation<EquipmentType, Long> implements CrudService<EquipmentType, Long> {


    public EquipmentTypeService(CrudRepository<EquipmentType, Long> repo) {
        super(repo);
    }

    public EquipmentType appendAppendPart(Long equipmentTypeId, Part part) {
        EquipmentType equipmentType = repo.findById(equipmentTypeId).orElseThrow();
        equipmentType.getParts().add(part);
        return repo.save(equipmentType);
    }
}
