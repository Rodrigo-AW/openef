package com.practicsi720ebu202210588api.inventory.interfaces.rest;


import com.practicsi720ebu202210588api.inventory.domain.model.aggregates.SparePart;
import com.practicsi720ebu202210588api.inventory.domain.model.commands.CreateSparePartCommand;
import com.practicsi720ebu202210588api.inventory.domain.services.ISparePartCommandService;
import com.practicsi720ebu202210588api.inventory.interfaces.rest.resources.CreateSparePartResource;
import com.practicsi720ebu202210588api.inventory.interfaces.rest.resources.SparePartResource;
import com.practicsi720ebu202210588api.inventory.interfaces.rest.transform.CreateSparePartCommandFromResourceAssembler;
import com.practicsi720ebu202210588api.inventory.interfaces.rest.transform.SparePartResourceFromEntityAssembler;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping(value = "/api/v1/equipments", produces =  MediaType.APPLICATION_JSON_VALUE)
public class SparePartController {
    private final ISparePartCommandService sparePartCommandService;

    public SparePartController(ISparePartCommandService sparePartCommandService)
    {
        this.sparePartCommandService = sparePartCommandService;
    }
    @PostMapping("/{equipmentId}/spare-parts")
    public ResponseEntity<SparePartResource> createSparePart(@PathVariable int equipmentId, @RequestBody CreateSparePartResource resource) {
        CreateSparePartCommand command = CreateSparePartCommandFromResourceAssembler.toCommandFromResource(resource, equipmentId);
        Optional<SparePart> sparePart = sparePartCommandService.handle(command);
        return sparePart.map(resp ->
                        new ResponseEntity<>(SparePartResourceFromEntityAssembler.toResourceFromEntity(resp), CREATED))
                .orElseGet(() -> ResponseEntity.badRequest().build());
    }





}
