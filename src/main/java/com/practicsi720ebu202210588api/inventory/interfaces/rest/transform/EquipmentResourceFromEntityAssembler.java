package com.practicsi720ebu202210588api.inventory.interfaces.rest.transform;

import com.practicsi720ebu202210588api.inventory.domain.model.aggregates.Equipment;
import com.practicsi720ebu202210588api.inventory.interfaces.rest.resources.EquipmentResource;

public class EquipmentResourceFromEntityAssembler {
    public static EquipmentResource toResourceFromEntity(Equipment entity) {
        return new EquipmentResource(entity.getId(), entity.getModel(), entity.getEquipmentType(), entity.getMaterialSerialNumber().toString());
    }
}
