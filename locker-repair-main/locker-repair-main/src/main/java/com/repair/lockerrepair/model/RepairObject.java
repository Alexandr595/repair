package com.repair.lockerrepair.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class RepairObject {
    @Id
    @GeneratedValue
    private Long id;
    private String objectName;
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "repair_order_id")
    private List<RepairOrder> repairOrders;
}
