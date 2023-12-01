package com.repair.lockerrepair.repository;

import com.repair.lockerrepair.model.Part;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartRepository extends CrudRepository<Part, Long> {
}
