package com.practicsi720ebu202210588api.inventory.infrastructure.persistence.jpa;

import com.practicsi720ebu202210588api.inventory.domain.model.aggregates.SparePart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ISparePartRepository extends JpaRepository<SparePart, Integer> {
    List<SparePart> findBySupplierIdAndModelAndSupplierProvidedSerialNumber(int supplierId, String model, String supplierProvidedSerialNumber);
}
