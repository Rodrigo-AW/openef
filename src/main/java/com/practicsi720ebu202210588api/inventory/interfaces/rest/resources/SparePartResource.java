package com.practicsi720ebu202210588api.inventory.interfaces.rest.resources;

import com.practicsi720ebu202210588api.inventory.domain.model.aggregates.Equipment;
import com.practicsi720ebu202210588api.inventory.domain.model.valueobjects.MaterialSerialNumber;

public record SparePartResource(int id, int supplierId, String model, String supplierProvidedSerialNumber,
                                String materialSerialNumber, Integer equipmentId) {
}