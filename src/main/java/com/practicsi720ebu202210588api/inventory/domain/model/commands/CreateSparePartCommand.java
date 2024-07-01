package com.practicsi720ebu202210588api.inventory.domain.model.commands;

import com.practicsi720ebu202210588api.inventory.domain.model.aggregates.Equipment;
import com.practicsi720ebu202210588api.inventory.domain.model.valueobjects.MaterialSerialNumber;

public record CreateSparePartCommand ( int supplierId, String model, String supplierProvidedSerialNumber, Integer equipmentId){
}