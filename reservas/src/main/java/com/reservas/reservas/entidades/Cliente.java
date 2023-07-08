package com.reservas.reservas.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tbl_cliente")
public class Cliente implements Serializable {

    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoCliente;
    private String nombresCliente;
    private String apellidosCliente;
    private String DNICliente ;
    private Date fecNacCliente;
    private String sexoCliente;
    private String tipoCliente;
    private String direccionCliente;
    private String usu_ultModificación;
    private String estadoCliente;
    private Date fecRegGe_Cliente;
    private Date fecUltMod_Cliente;
    private String correoCliente;
    private String celularCliente;
    private String estadoCivilCliente;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "cliente")
    private List<Reserva> reservas;

}