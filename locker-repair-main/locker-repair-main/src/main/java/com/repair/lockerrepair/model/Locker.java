package com.repair.lockerrepair.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Locker {
    @Id
    @GeneratedValue
    private Long id;
    private Long number;
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "equipment_type_id")
    private List<EquipmentType> equipmentTypes;
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "repair_request_id")
    private List<RepairRequest> repairRequests;
}
