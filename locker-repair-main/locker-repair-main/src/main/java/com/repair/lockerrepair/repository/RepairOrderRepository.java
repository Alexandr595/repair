package com.repair.lockerrepair.repository;

import com.repair.lockerrepair.model.RepairOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepairOrderRepository extends CrudRepository<RepairOrder, Long> {
}
