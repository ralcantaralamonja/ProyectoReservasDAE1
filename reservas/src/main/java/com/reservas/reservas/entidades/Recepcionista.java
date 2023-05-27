package com.reservas.reservas.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Recepcionista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreRecepcionista;
    private String apellidoRecepcionista;
    private String DNIRecepcionista;
    private String sexoRecepcionista;
    private String correoRecepcionista;
    private String celularRecepcionista;
    private Date fecNac_Recepcionista;
    private Date fecReg_Recepcionista;
    private String usuarioRecepcionista;
    private Date fecUltMod_Recepcionista;
    private String usuUltMod_Recepcionista;
    private String estadoRe;
    private String codHot;
    private String codSup;
    private double sueldo;
}
