package com.reservas.reservas.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tbl_tipoHabitacion")
public class TipoHabitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoHapitacion;
    private String descripcion;
    private double tarifa;
}
