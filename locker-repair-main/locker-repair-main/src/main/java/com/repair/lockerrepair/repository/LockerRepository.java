package com.repair.lockerrepair.repository;

import com.repair.lockerrepair.model.Locker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LockerRepository extends CrudRepository<Locker, Long> {
}
