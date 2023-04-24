package com.devcastro.apiconsumoselectricidad.services;

import com.devcastro.apiconsumoselectricidad.entities.ElectricalConsumption;

import java.util.List;
import java.util.Map;

public interface IConsumptionService {

    List<ElectricalConsumption> list();
    Map<String,Double> getConsumptionByDate(String meterDate);
    Map<String, Double> getConsumptionByMonth(String meterDate);
    Map<String, Double> getConsumptionByWeek(String meterDate);


}
