package com.devcastro.apiconsumoselectricidad.repository;


import com.devcastro.apiconsumoselectricidad.entities.ElectricalConsumption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IConsumptionRepository extends JpaRepository<ElectricalConsumption, Integer> {
}
