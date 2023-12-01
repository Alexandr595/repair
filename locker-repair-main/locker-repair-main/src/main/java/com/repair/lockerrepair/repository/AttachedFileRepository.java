package com.repair.lockerrepair.repository;

import com.repair.lockerrepair.model.AttachedFile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttachedFileRepository extends CrudRepository<AttachedFile, Long> {
}
