package com.reservas.reservas.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "tbl_reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoReservaid;
    private String FecIniReserva;
    private String FecFinReserva;
    private int CodigoCliente ;
    private int CodigoReserva ;
    private String EstadoReserva;
    private int CodHabitacion;

}
