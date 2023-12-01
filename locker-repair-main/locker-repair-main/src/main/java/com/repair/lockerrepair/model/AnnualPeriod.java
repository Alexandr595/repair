package com.repair.lockerrepair.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class AnnualPeriod {
    @Id
    @GeneratedValue
    private Long id;
    private String year;
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "customer_id")
    private List<Customer> customers;
}
