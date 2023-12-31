package com.repair.lockerrepair.controller.common;

import com.repair.lockerrepair.service.common.CrudService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class CrudController<T, ID> {

    private final CrudService<T, ID> service;

    public CrudController(CrudService<T, ID> service) {
        this.service = service;
    }

    @GetMapping("/findAll")
    public List<T> findAll() {
        return service.findAll();
    }

    @GetMapping("/findById/{id}")
    public T findById(@PathVariable ID id) {
        return service.findById(id).orElse(null);
    }

    @PostMapping("/save")
    public T save(@RequestBody T object) {
        return service.save(object);
    }

    @PostMapping("/update")
    public T update(@RequestBody T object) {
        return service.update(object);
    }

    @PostMapping("/delete")
    public boolean delete(@RequestBody T object) {
        return service.delete(object);
    }

    @GetMapping("/deleteById/{id}")
    public boolean deleteById(@PathVariable ID id) {
        return service.deleteById(id);
    }
}
