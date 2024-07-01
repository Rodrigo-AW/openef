package com.practicsi720ebu202210588api.inventory.interfaces.rest.transform;

import com.practicsi720ebu202210588api.inventory.domain.model.commands.CreateSparePartCommand;
import com.practicsi720ebu202210588api.inventory.interfaces.rest.resources.CreateSparePartResource;

public class CreateSparePartCommandFromResourceAssembler {
    public static CreateSparePartCommand toCommandFromResource(CreateSparePartResource resource, int equipmentId) {
        return new CreateSparePartCommand(resource.supplierId(), resource.model(), resource.supplierProvidedSerialNumber(), equipmentId) ;
    }
}
