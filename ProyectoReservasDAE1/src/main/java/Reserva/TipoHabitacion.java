package Reserva;

public class TipoHabitacion {

    private int codigoHabitacion;
    private String descripcion;
    private double tarifa;

    public TipoHabitacion(int codigoHabitacion, String descripcion, double tarifa) {
        this.codigoHabitacion = codigoHabitacion;
        this.descripcion = descripcion;
        this.tarifa = tarifa;
    }

    public int getCodigoHabitacion() {
        return codigoHabitacion;
    }

    public void setCodigoHabitacion(int codigoHabitacion) {
        this.codigoHabitacion = codigoHabitacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
}
