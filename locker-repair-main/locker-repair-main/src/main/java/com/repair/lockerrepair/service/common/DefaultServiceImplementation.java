package com.repair.lockerrepair.service.common;

import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DefaultServiceImplementation<T, ID> implements CrudService<T, ID> {

    protected final CrudRepository<T, ID> repo;

    public DefaultServiceImplementation(CrudRepository<T, ID> repo) {
        this.repo = repo;
    }

    @Override
    public List<T> findAll() {
        List<T> list = new ArrayList<>();
        repo.findAll().forEach(list::add);
        return list;
    }

    @Override
    public Optional<T> findById(ID id) {
        return repo.findById(id);
    }

    @Override
    public T save(T object) {
        return repo.save(object);
    }

    @Override
    public T update(T object) {
        // update ?
        return repo.save(object);
    }

    @Override
    public boolean delete(T object) {
        repo.delete(object);
        return true;
    }

    @Override
    public boolean deleteById(ID id) {
        repo.deleteById(id);
        return true;
    }

}
