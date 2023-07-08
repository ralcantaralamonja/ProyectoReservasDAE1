package com.reservas.reservas.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tbl_detalleReserva")
public class DetalleReserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoReserva;
    private Long codHabitacion;
    private Long Cod_Ho;
    private double tarifa;
}
