package com.practicsi720ebu202210588api.inventory.interfaces.rest.transform;

import com.practicsi720ebu202210588api.inventory.domain.model.commands.CreateEquipmentCommand;
import com.practicsi720ebu202210588api.inventory.interfaces.rest.resources.CreateEquipmentResource;
import com.practicsi720ebu202210588api.inventory.interfaces.rest.resources.EquipmentResource;

public class CreateEquipmentCommandFromResourceAssembler {
    public static CreateEquipmentCommand toCommandFromResource (CreateEquipmentResource resource) {
        return new CreateEquipmentCommand(resource.model(), resource.equipmentType());
    }
}
