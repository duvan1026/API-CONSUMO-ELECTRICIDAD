package com.devcastro.apiconsumoselectricidad.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "consumos")
public class ElectricalConsumption implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="active_energy")
    private Double activeEnergy;
    @Column(name="meter_date")
    private Date meterDate;
    @Column(name="meter_id")
    private String meterId;
    @Column(name="meter_hour")
    private String meterHour;


}
