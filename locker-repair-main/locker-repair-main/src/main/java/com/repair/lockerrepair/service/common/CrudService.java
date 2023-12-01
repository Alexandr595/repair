package com.repair.lockerrepair.service.common;

import com.repair.lockerrepair.CrudInterface;

import java.util.List;
import java.util.Optional;

public interface CrudService<T, ID> {

    List<T> findAll();
    Optional<T> findById(ID id);
    T save(T object);
    T update(T object);
    boolean delete(T object);
    boolean deleteById(ID id);

}
