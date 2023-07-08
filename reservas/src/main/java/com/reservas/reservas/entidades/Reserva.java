package com.reservas.reservas.entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "tbl_reserva")
public class Reserva implements Serializable {

    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoReservaid;
    private String FecIniReserva;
    private String FecFinReserva;
    private int CodigoCliente ;
    private int CodigoReserva ;
    private String EstadoReserva;
    private int CodHabitacion;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    @JsonIgnoreProperties("reserva")
    private Cliente cliente;

}
