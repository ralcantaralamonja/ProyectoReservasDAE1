package com.reservas.reservas.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tbl_usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idusuario;
    private String login_user;
    private String password_user;
    private int niv_user;
    private int est_user;
    private String fec_registro;
    private String usu_registro;

}
