package com.practicsi720ebu202210588api.inventory.infrastructure.persistence.jpa;

import com.practicsi720ebu202210588api.inventory.domain.model.aggregates.Equipment;
import com.practicsi720ebu202210588api.inventory.domain.model.valueobjects.MaterialSerialNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEquipmentRepository extends JpaRepository<Equipment, Integer> {
    List<Equipment> findByMaterialSerialNumber(MaterialSerialNumber materialSerialNumber);






}
