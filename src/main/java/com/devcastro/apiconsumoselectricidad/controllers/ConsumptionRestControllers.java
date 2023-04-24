package com.devcastro.apiconsumoselectricidad.controllers;

import com.devcastro.apiconsumoselectricidad.entities.ElectricalConsumption;
import com.devcastro.apiconsumoselectricidad.repository.IConsumptionRepository;
import com.devcastro.apiconsumoselectricidad.services.IConsumptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/consumption")
public class ConsumptionRestControllers {

    @Autowired // Inyectamos el servicio
    private IConsumptionService consumptionService;

    @GetMapping("/findAll")
    public List<ElectricalConsumption> list(){
        return consumptionService.list();
    }
}
