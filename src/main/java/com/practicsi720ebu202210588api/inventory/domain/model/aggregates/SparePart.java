package com.practicsi720ebu202210588api.inventory.domain.model.aggregates;

import com.practicsi720ebu202210588api.inventory.domain.model.commands.CreateSparePartCommand;
import com.practicsi720ebu202210588api.inventory.domain.model.valueobjects.MaterialSerialNumber;
import com.practicsi720ebu202210588api.shared.domain.model.aggregates.AuditableAbstractAggregateRoot;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.AbstractAggregateRoot;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Setter
@Getter
@Entity
@EntityListeners(AuditingEntityListener.class)
public class SparePart extends AuditableAbstractAggregateRoot<SparePart> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id;
    @Column(nullable = false)

    private  String materialSerialNumber;

    @Column(nullable = false)
    private int supplierId;

    @Column(nullable = false)
    private String model;

    @Column(nullable = false)
    private String supplierProvidedSerialNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "equipment_id")
    private Equipment equipment;



    public SparePart(CreateSparePartCommand command, Equipment equipment) {
        this.supplierId = command.supplierId();
        this.model = command.model();
        this.supplierProvidedSerialNumber = command.supplierProvidedSerialNumber();
        this.equipment = equipment;
    }

    public SparePart() {

    }
}