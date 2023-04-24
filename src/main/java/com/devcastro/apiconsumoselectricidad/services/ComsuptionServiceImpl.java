package com.devcastro.apiconsumoselectricidad.services;

import com.devcastro.apiconsumoselectricidad.entities.ElectricalConsumption;
import com.devcastro.apiconsumoselectricidad.repository.IConsumptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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
