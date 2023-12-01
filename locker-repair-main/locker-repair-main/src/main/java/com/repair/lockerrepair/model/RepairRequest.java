package com.repair.lockerrepair.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class RepairRequest {
    @Id
    @GeneratedValue
    private Long id;
    private String status;
    private Long number;
    private LocalDate entryDate;
    private String repairKind;
    private String repair;
    private String responsibleWorker;
    private LocalDate completionDate;
    private String failureCharacteristic;
    private String comment;
    private String files;
}
