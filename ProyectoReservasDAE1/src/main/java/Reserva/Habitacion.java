package Reserva;

import java.util.Date;

public class Habitacion {

    int codHabitacion;
    String tipoHabitacion;
    int numPiso;
    String disponibilidadHabitacion;
    int codHotel;

    public Habitacion(int codHabitacion, String tipoHabitacion,int numPiso, String disponibilidadHabitacion, int codHotel){
        this.codHabitacion= codHabitacion;
        this.tipoHabitacion=tipoHabitacion;
        this.numPiso=numPiso;
        this.disponibilidadHabitacion=disponibilidadHabitacion;
        this.codHotel=codHotel;
    }

    public Habitacion(String tipoHabitacion, int numPiso, String disponibilidadHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
        this.disponibilidadHabitacion=disponibilidadHabitacion;
        this.numPiso=numPiso;
    }

    public int getCodHabitacion() {
        return codHabitacion;
    }

    public void setCodHabitacion(int codHabitacion) {
        this.codHabitacion = codHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }



    public int getNumPiso() {
        return numPiso;
    }

    public void setNumPiso(int numPiso) {
        this.numPiso = numPiso;
    }

    public String getDisponibilidadHabitacion() {
        return disponibilidadHabitacion;
    }

    public void setDisponibilidadHabitacion(String disponibilidadHabitacion) {
        this.disponibilidadHabitacion = disponibilidadHabitacion;
    }

    public int getCodHotel() {
        return codHotel;
    }

    public void setCodHotel(int codHotel) {
        this.codHotel = codHotel;
    }
}
