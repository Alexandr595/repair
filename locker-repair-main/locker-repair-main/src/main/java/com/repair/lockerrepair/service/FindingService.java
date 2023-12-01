package com.repair.lockerrepair.service;

import com.repair.lockerrepair.dto.FindingDTO;
import com.repair.lockerrepair.model.AnnualPeriod;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FindingService {

    private final AnnualPeriodService annualPeriodService;

    public FindingService(AnnualPeriodService annualPeriodService) {
        this.annualPeriodService = annualPeriodService;
    }

    public List<AnnualPeriod> findByMask(FindingDTO findingDTO) {
        List<AnnualPeriod> res = annualPeriodService.findAll();
        if (findingDTO.getYear() != null) {
            res = res.stream()
                    .filter(annualPeriod -> annualPeriod.getYear().startsWith(findingDTO.getYear()))
                    .collect(Collectors.toList());
        }
        res.forEach(annualPeriod -> {
            if (findingDTO.getCustomerName() != null) {
                annualPeriod.setCustomers(annualPeriod.getCustomers().stream()
                        .filter(customer -> customer.getName().startsWith(findingDTO.getCustomerName()))
                        .collect(Collectors.toList()));
            }
            annualPeriod.getCustomers().forEach(customer -> {
                if (findingDTO.getObjectName() != null) {
                    customer.setRepairObjects(customer.getRepairObjects().stream()
                            .filter(repairObject -> repairObject.getObjectName().startsWith(findingDTO.getObjectName()))
                            .collect(Collectors.toList()));
                }
                customer.getRepairObjects().forEach(repairObject -> {
                    if (findingDTO.getOrderNumber() != null) {
                        repairObject.setRepairOrders(repairObject.getRepairOrders().stream()
                                .filter(repairOrder -> repairOrder.getOrderNumber().toString().startsWith(findingDTO.getOrderNumber()))
                                .collect(Collectors.toList()));
                    }
                    if (findingDTO.getOrderType() != null) {
                        repairObject.setRepairOrders(repairObject.getRepairOrders().stream()
                                .filter(repairOrder -> repairOrder.getOrderType().startsWith(findingDTO.getOrderType()))
                                .collect(Collectors.toList()));
                    }
                    repairObject.getRepairOrders().forEach(repairOrder -> {
                        if (findingDTO.getLockerNumber() != null) {
                            repairOrder.setLockers(repairOrder.getLockers().stream()
                                    .filter(locker -> locker.getNumber().toString().startsWith(findingDTO.getLockerNumber()))
                                    .collect(Collectors.toList()));
                        }
                        repairOrder.getLockers().forEach(locker -> {
                            if (findingDTO.getEquipmentTypeName() != null) {
                                locker.setEquipmentTypes(locker.getEquipmentTypes().stream()
                                        .filter(equipmentType -> equipmentType.getName().startsWith(findingDTO.getEquipmentTypeName()))
                                        .collect(Collectors.toList()));
                            }
                            if (findingDTO.getEquipmentTypeFactoryNumber() != null) {
                                locker.setEquipmentTypes(locker.getEquipmentTypes().stream()
                                        .filter(equipmentType -> equipmentType.getFactoryNumber().startsWith(findingDTO.getEquipmentTypeFactoryNumber()))
                                        .collect(Collectors.toList()));
                            }
                            locker.getEquipmentTypes().forEach(equipmentType -> {
                                if (findingDTO.getPartName() != null) {
                                    equipmentType.setParts(equipmentType.getParts().stream()
                                            .filter(part -> part.getName().startsWith(findingDTO.getPartName()))
                                            .collect(Collectors.toList()));
                                }
                                if (findingDTO.getPartFactoryNumber() != null) {
                                    equipmentType.setParts(equipmentType.getParts().stream()
                                            .filter(part -> part.getFactoryNumber().startsWith(findingDTO.getPartFactoryNumber()))
                                            .collect(Collectors.toList()));
                                }
                                if (findingDTO.getPartSoftwareVersion() != null) {
                                    equipmentType.setParts(equipmentType.getParts().stream()
                                            .filter(part -> part.getSoftwareVersion().startsWith(findingDTO.getPartSoftwareVersion()))
                                            .collect(Collectors.toList()));
                                }
                                if (findingDTO.getPartBasicEquipment() != null) {
                                    equipmentType.setParts(equipmentType.getParts().stream()
                                            .filter(part -> part.getBasicEquipment().startsWith(findingDTO.getPartBasicEquipment()))
                                            .collect(Collectors.toList()));
                                }
                            });
                            if (findingDTO.getRepairRequestStatus() != null) {
                                locker.setRepairRequests(locker.getRepairRequests().stream()
                                        .filter(repairRequest -> repairRequest.getStatus().startsWith(findingDTO.getRepairRequestStatus()))
                                        .collect(Collectors.toList()));
                            }
                            if (findingDTO.getRepairRequestNumber() != null) {
                                locker.setRepairRequests(locker.getRepairRequests().stream()
                                        .filter(repairRequest -> repairRequest.getNumber().toString().startsWith(findingDTO.getRepairRequestNumber()))
                                        .collect(Collectors.toList()));
                            }
                            if (findingDTO.getRepairRequestEntryDate() != null) {
                                locker.setRepairRequests(locker.getRepairRequests().stream()
                                        .filter(repairRequest -> repairRequest.getEntryDate().toString().startsWith(findingDTO.getRepairRequestEntryDate()))
                                        .collect(Collectors.toList()));
                            }
                            if (findingDTO.getRepairRequestRepairKind() != null) {
                                locker.setRepairRequests(locker.getRepairRequests().stream()
                                        .filter(repairRequest -> repairRequest.getRepairKind().startsWith(findingDTO.getRepairRequestRepairKind()))
                                        .collect(Collectors.toList()));
                            }
                            if (findingDTO.getRepairRequestRepair() != null) {
                                locker.setRepairRequests(locker.getRepairRequests().stream()
                                        .filter(repairRequest -> repairRequest.getRepair().startsWith(findingDTO.getRepairRequestRepair()))
                                        .collect(Collectors.toList()));
                            }
                            if (findingDTO.getRepairRequestResponsibleWorker() != null) {
                                locker.setRepairRequests(locker.getRepairRequests().stream()
                                        .filter(repairRequest -> repairRequest.getResponsibleWorker().startsWith(findingDTO.getRepairRequestResponsibleWorker()))
                                        .collect(Collectors.toList()));
                            }
                            if (findingDTO.getRepairRequestCompletionDate() != null) {
                                locker.setRepairRequests(locker.getRepairRequests().stream()
                                        .filter(repairRequest -> repairRequest.getCompletionDate().toString().startsWith(findingDTO.getRepairRequestCompletionDate()))
                                        .collect(Collectors.toList()));
                            }
                            if (findingDTO.getRepairRequestFailureCharacteristic() != null) {
                                locker.setRepairRequests(locker.getRepairRequests().stream()
                                        .filter(repairRequest -> repairRequest.getFailureCharacteristic().startsWith(findingDTO.getRepairRequestFailureCharacteristic()))
                                        .collect(Collectors.toList()));
                            }
                            if (findingDTO.getRepairRequestComment() != null) {
                                locker.setRepairRequests(locker.getRepairRequests().stream()
                                        .filter(repairRequest -> repairRequest.getComment().startsWith(findingDTO.getRepairRequestComment()))
                                        .collect(Collectors.toList()));
                            }
                        });
                    });
                });
            });
        });
        return res;
    }
}
