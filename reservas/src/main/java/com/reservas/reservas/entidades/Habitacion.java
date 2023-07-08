package com.reservas.reservas.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tbl_habitacion")
public class Habitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codHabitacion;
    private String tipoHabitacion;
    private int numPiso;
    private String disponibilidadHabitacion;
    private int codHotel;
}
