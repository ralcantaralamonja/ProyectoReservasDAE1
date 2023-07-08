package com.reservas.reservas.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tbl_recepcionista")
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
