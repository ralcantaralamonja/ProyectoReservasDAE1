package Reserva;

import java.util.Date;

public class Reserva {
    int codigoReserva;
    String FechaInicio;
    String FechaFin;
    int codigoCliente;
    String nombreCliente;
    String estadoReserva;

    String apellidoCliente;


    public Reserva(int codigoReserva, String FechaInicio, String FechaFin, int codigoCliente,
                   String nombreCliente, String estadoReserva) {
        this.codigoReserva = codigoReserva;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
        this.codigoCliente = codigoCliente;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.estadoReserva = estadoReserva;
    }


    public Reserva (String apellidoCliente, String FechaInicio) {
        this.apellidoCliente = apellidoCliente;
        this.FechaInicio = getFechaInicio();
    }

    public int getCodigoReserva() {
        return codigoReserva;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public String getFechaInicio() {
        return FechaInicio;
    }

    public String getFechaFin() {
        return FechaFin;
    }

    public String getNombreCliente() { return nombreCliente; }

    public String getApellidoCliente() {return  apellidoCliente; }

    public String getEstadoReserva() { return estadoReserva; }
}