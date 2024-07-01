package com.practicsi720ebu202210588api.inventory.interfaces.rest.resources;

import com.practicsi720ebu202210588api.inventory.domain.model.aggregates.Equipment;

public record CreateSparePartResource(int supplierId, String model, String supplierProvidedSerialNumber) {
}
