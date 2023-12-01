package com.repair.lockerrepair.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Data;

@Data
@Entity
public class AttachedFile {
    @Id
    @GeneratedValue
    private Long id;
    @Lob
    private byte[] data;
    private String name;
    private String contentType;
}
