package com.repair.lockerrepair.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Part {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String factoryNumber;
    private String softwareVersion;
    private String basicEquipment;

}
