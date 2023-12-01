package com.repair.lockerrepair.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "repair_object_id")
    private List<RepairObject> repairObjects;
}
