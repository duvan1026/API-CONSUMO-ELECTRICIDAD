package com.devcastro.apiconsumoselectricidad.services;

import com.devcastro.apiconsumoselectricidad.entities.ElectricalConsumption;
import com.devcastro.apiconsumoselectricidad.repository.IConsumptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

@Service
public class ComsuptionServiceImpl implements IConsumptionService{

    @Autowired
    private IConsumptionRepository consumptionRepository; // Objeto que establece conexión con la BD

    @Override
    public List<ElectricalConsumption> list() {
        return consumptionRepository.findAll();
    }

    @Override
    public Map<String, Double> getConsumptionByDate(String meterDate) {

        double maxiumConsumption = 0; // Consumo máximo por hora
        double minimunConsumption; // Consumo mínimo por hora
        double dailyConsumption = 0; // Consumo diario
        String startWith = "00"; // Inicia con

        SortedMap<String, Double> consumptionPerHour = new TreeMap<>(); // Data de salida ordenada
        List<ElectricalConsumption> consumptionPerDay = consumptionRepository.getConsumptionbyDate(meterDate);



        return null;
    }

    @Override
    public Map<String, Double> getConsumptionByMonth(String meterDate) {
        return null;
    }

    @Override
    public Map<String, Double> getConsumptionByWeek(String meterDate) {
        return null;
    }
}
