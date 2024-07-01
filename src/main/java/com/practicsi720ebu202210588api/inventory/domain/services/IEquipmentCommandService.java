package com.practicsi720ebu202210588api.inventory.domain.services;

import com.practicsi720ebu202210588api.inventory.domain.model.aggregates.Equipment;
import com.practicsi720ebu202210588api.inventory.domain.model.commands.CreateEquipmentCommand;

import java.util.Optional;

public interface IEquipmentCommandService {

    Optional<Equipment>handle(CreateEquipmentCommand command);

}
