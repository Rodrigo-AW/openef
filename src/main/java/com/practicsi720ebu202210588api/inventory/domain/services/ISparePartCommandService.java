package com.practicsi720ebu202210588api.inventory.domain.services;

import com.practicsi720ebu202210588api.inventory.domain.model.aggregates.SparePart;
import com.practicsi720ebu202210588api.inventory.domain.model.commands.CreateSparePartCommand;

import java.util.Optional;

public interface ISparePartCommandService {
    Optional<SparePart> handle(CreateSparePartCommand command);
}
