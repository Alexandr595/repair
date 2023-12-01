package com.repair.lockerrepair.dto;

import lombok.Data;

@Data
public class FindingDTO {

    private String year;
    private String customerName;
    private String objectName;
    private String orderNumber;
    private String orderType;
    private String lockerNumber;
    private String equipmentTypeName;
    private String equipmentTypeFactoryNumber;
    private String partName;
    private String partFactoryNumber;
    private String partSoftwareVersion;
    private String partBasicEquipment;
    private String repairRequestStatus;
    private String repairRequestNumber;
    private String repairRequestEntryDate;
    private String repairRequestRepairKind;
    private String repairRequestRepair;
    private String repairRequestResponsibleWorker;
    private String repairRequestCompletionDate;
    private String repairRequestFailureCharacteristic;
    private String repairRequestComment;

}
