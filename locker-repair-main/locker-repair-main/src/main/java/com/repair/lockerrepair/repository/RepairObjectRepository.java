package com.repair.lockerrepair.repository;

import com.repair.lockerrepair.model.RepairObject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepairObjectRepository extends CrudRepository<RepairObject, Long> {
}
