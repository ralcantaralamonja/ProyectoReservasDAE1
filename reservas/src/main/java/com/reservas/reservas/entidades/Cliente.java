package com.reservas.reservas.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Cliente {
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

}
