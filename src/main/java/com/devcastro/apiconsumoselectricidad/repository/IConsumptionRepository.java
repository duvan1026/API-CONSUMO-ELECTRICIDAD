package com.devcastro.apiconsumoselectricidad.repository;


import com.devcastro.apiconsumoselectricidad.entities.ElectricalConsumption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IConsumptionRepository extends JpaRepository<ElectricalConsumption, Integer> {

    /**
     * Obtiene los registros de consumo de electricidad en una fecha especifica.
     *
     * @param meterDate por el cuál se listarán los registros.
     * @return Lista de tipo de Consumo con los registros encontrados.
     * @author Duvan Dario Castro Bautista
     */
    @Query(value = "SELECT * FROM CONSUMOS WHERE METER_DATE=:meterDate", nativeQuery = true)
    List<ElectricalConsumption> getConsumptionbyDate(String meterDate);
}
