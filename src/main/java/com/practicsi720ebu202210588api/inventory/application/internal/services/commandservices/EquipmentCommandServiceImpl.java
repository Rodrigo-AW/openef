package com.practicsi720ebu202210588api.inventory.application.internal.services.commandservices;

import com.practicsi720ebu202210588api.inventory.domain.model.aggregates.Equipment;
import com.practicsi720ebu202210588api.inventory.domain.model.commands.CreateEquipmentCommand;
import com.practicsi720ebu202210588api.inventory.domain.services.IEquipmentCommandService;
import com.practicsi720ebu202210588api.inventory.infrastructure.persistence.jpa.IEquipmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EquipmentCommandServiceImpl implements IEquipmentCommandService {
    private final IEquipmentRepository equipmentRepository;

    public EquipmentCommandServiceImpl(IEquipmentRepository equipmentRepository) {
        this.equipmentRepository = equipmentRepository;
    }

    @Override
    public Optional<Equipment> handle(CreateEquipmentCommand command) {
        Equipment equipment = new Equipment(command);

        List<Equipment>existingEquipments = equipmentRepository.findByMaterialSerialNumber(equipment.getMaterialSerialNumber());
        if(!existingEquipments.isEmpty()){
             throw new IllegalArgumentException("Equipment with the same serial number already exists");
        }
        equipmentRepository.save(equipment);
        return Optional.of(equipment);

    }

}
