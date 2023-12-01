package com.repair.lockerrepair.repository;

import com.repair.lockerrepair.model.EquipmentType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipmentTypeRepository extends CrudRepository<EquipmentType, Long> {
}
