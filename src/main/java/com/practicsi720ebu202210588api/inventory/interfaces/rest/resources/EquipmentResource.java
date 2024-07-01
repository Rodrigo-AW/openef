package com.practicsi720ebu202210588api.inventory.interfaces.rest.resources;

import com.practicsi720ebu202210588api.inventory.domain.model.valueobjects.EEquipmentType;
import com.practicsi720ebu202210588api.inventory.domain.model.valueobjects.MaterialSerialNumber;

public record EquipmentResource(int id, String model, EEquipmentType equipmentType, String materialSerialNumber) {

}
