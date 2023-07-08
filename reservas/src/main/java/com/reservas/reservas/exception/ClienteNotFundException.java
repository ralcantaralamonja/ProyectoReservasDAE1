package com.reservas.reservas.exception;

public class ClienteNotFundException extends RuntimeException{
    public ClienteNotFundException(Long id){
        super(String.format("Cliente con id : %s no registrado en la base de datos", id));
    }
}
