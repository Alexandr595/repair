package com.repair.lockerrepair.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class EquipmentType {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String factoryNumber;
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "part_id")
    private List<Part> parts;
}
