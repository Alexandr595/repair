package com.repair.lockerrepair.repository;

import com.repair.lockerrepair.model.AnnualPeriod;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnualPeriodRepository extends CrudRepository<AnnualPeriod, Long> {
}
