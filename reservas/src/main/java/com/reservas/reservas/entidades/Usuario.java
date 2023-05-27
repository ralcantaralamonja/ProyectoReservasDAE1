package com.reservas.reservas.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;
@Data
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String login_user;
    private String password_user;
    private int niv_user;
    private int est_user;
    private String fec_registro;
    private String usu_registro;

}
