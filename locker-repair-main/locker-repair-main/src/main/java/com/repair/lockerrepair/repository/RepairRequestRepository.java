package com.repair.lockerrepair.repository;

import com.repair.lockerrepair.model.RepairRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepairRequestRepository extends CrudRepository<RepairRequest, Long> {
}
