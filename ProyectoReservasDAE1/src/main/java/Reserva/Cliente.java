package Reserva;
import java.util.Date;

import java.time.LocalDate;
import java.util.Date;

public class Cliente {

    private  int codigoCliente;
    private String nombreCliente;
    private String apellidoCliente;
    private String DNICliente ;
    private String sexoCliente;
    private String tipoCliente;
    private String direccionCliente;
    private String usuario_ultModificación;
    private char estadoCliente;
    private Date fecha_registroCliente;
    private Date feha_ultModCliente;
    private String correoCliente;
    private String celularCliente;
    private char estadoCivilCliente;
    private Date fec_nacCliente;


    public Cliente(int codigoCliente, String nombreCliente, String apellidoCliente, String DNICliente, String sexoCliente, String tipoCliente, String direccionCliente, String usuario_ultModificación, char estadoCliente, Date fecha_registroCliente, Date feha_ultModCliente, String correoCliente, String celularCliente, char estadoCivilCliente, Date fec_nacCliente) {
        this.codigoCliente = codigoCliente;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.DNICliente = DNICliente;
        this.sexoCliente = sexoCliente;
        this.tipoCliente = tipoCliente;
        this.direccionCliente = direccionCliente;
        this.usuario_ultModificación = usuario_ultModificación;
        this.estadoCliente = estadoCliente;
        this.fecha_registroCliente = fecha_registroCliente;
        this.feha_ultModCliente = feha_ultModCliente;
        this.correoCliente = correoCliente;
        this.celularCliente = celularCliente;
        this.estadoCivilCliente = estadoCivilCliente;
        this.fec_nacCliente = fec_nacCliente;
    }

    public Cliente(String nombreCliente, String apellidoCliente) {
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getDNICliente() {
        return DNICliente;
    }

    public void setDNICliente(String DNICliente) {
        this.DNICliente = DNICliente;
    }

    public String getSexoCliente() {
        return sexoCliente;
    }

    public void setSexoCliente(String sexoCliente) {
        this.sexoCliente = sexoCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getUsuario_ultModificación() {
        return usuario_ultModificación;
    }

    public void setUsuario_ultModificación(String usuario_ultModificación) {
        this.usuario_ultModificación = usuario_ultModificación;
    }

    public char getEstadoCliente() {
        return estadoCliente;
    }

    public void setEstadoCliente(char estadoCliente) {
        this.estadoCliente = estadoCliente;
    }

    public Date getFecha_registroCliente() {
        return fecha_registroCliente;
    }

    public void setFecha_registroCliente(Date fecha_registroCliente) {
        this.fecha_registroCliente = fecha_registroCliente;
    }

    public Date getFeha_ultModCliente() {
        return feha_ultModCliente;
    }

    public void setFeha_ultModCliente(Date feha_ultModCliente) {
        this.feha_ultModCliente = feha_ultModCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public String getCelularCliente() {
        return celularCliente;
    }

    public void setCelularCliente(String celularCliente) {
        this.celularCliente = celularCliente;
    }

    public char getEstadoCivilCliente() {
        return estadoCivilCliente;
    }

    public void setEstadoCivilCliente(char estadoCivilCliente) {
        this.estadoCivilCliente = estadoCivilCliente;
    }

    public Date getFec_nacCliente() {
        return fec_nacCliente;
    }

    public void setFec_nacCliente(Date fec_nacCliente) {
        this.fec_nacCliente = fec_nacCliente;
    }
}
