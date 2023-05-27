package com.reservas.reservas.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoReserva;
    private String FecIniReserva;
    private String FecFinReserva;
    private int CodigoCliente ;
    private int CodigoReserva ;
    private String EstadoReserva;
    private int CodHabitacion;

}
