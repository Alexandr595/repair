package com.repair.lockerrepair;

import java.util.Optional;

public interface CrudInterface<T, ID> {

    Iterable<T> findAll();
    Optional<T> findById(ID id);
    T save(T object);
    T update(T object);
    void delete(T object);
    void deleteById(ID id);

}
