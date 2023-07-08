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
@Table(name = "tbl_hotel")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Cod_Ho;
    private String Dir_Ho;
    private String Tel_Hc;
    private Date Fec_Const;
}
