package com.repair.lockerrepair.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class RepairOrder {
    @Id
    @GeneratedValue
    private Long id;
    private Long orderNumber;
    private String orderType;
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "locker_id")
    private List<Locker> lockers;
}
