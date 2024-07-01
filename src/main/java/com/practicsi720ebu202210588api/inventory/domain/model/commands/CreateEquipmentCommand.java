package com.practicsi720ebu202210588api.inventory.domain.model.commands;

import com.practicsi720ebu202210588api.inventory.domain.model.valueobjects.EEquipmentType;
import com.practicsi720ebu202210588api.inventory.domain.model.valueobjects.MaterialSerialNumber;

public record CreateEquipmentCommand (String model, EEquipmentType equipmentType){




}
