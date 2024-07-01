package com.practicsi720ebu202210588api.inventory.domain.model.aggregates;

import com.practicsi720ebu202210588api.inventory.domain.model.commands.CreateEquipmentCommand;
import com.practicsi720ebu202210588api.inventory.domain.model.valueobjects.EEquipmentType;
import com.practicsi720ebu202210588api.inventory.domain.model.valueobjects.MaterialSerialNumber;
import com.practicsi720ebu202210588api.shared.domain.model.aggregates.AuditableAbstractAggregateRoot;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.domain.AbstractAggregateRoot;
import org.springframework.data.domain.Auditable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Equipment extends AuditableAbstractAggregateRoot<Equipment> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    @Embedded
    @Column(name = "material_serial_number")
    private final MaterialSerialNumber materialSerialNumber;

    @Column(nullable = false)
    private String model;

    @Column(nullable = false)
    private EEquipmentType equipmentType;

    @OneToMany(mappedBy = "equipment", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SparePart> spareParts;
    public Equipment() {
        this.materialSerialNumber = new MaterialSerialNumber();
    }

    public Equipment(CreateEquipmentCommand command) {
        this();
        this.model = command.model();

        this.equipmentType = command.equipmentType();
    }



}
