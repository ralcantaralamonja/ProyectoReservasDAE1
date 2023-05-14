package Reserva;

import java.util.Date;

public class Recepcionista {

    private String nombre;
    private String apellido;
    private String id;
    private String DNI;
    private String sexo;
    private String correo;
    private String celular;
    private Date fecNac;
    private Date fecReg;
    private String usuario;
    private Date fecUltMod;
    private String usuarioUltMod;
    private int estadoRe;
    private String codHot;
    private String codSup;
    private double sueldo;


    public Recepcionista(String nombre, String apellido, String id, String DNI, String sexo, String correo, String celular, Date fecNac, Date fecReg, String usuario, Date fecUltMod, String usuarioUltMod, int estadoRe, String codHot, String codSup, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.DNI = DNI;
        this.sexo = sexo;
        this.correo = correo;
        this.celular = celular;
        this.fecNac = fecNac;
        this.fecReg = fecReg;
        this.usuario = usuario;
        this.fecUltMod = fecUltMod;
        this.usuarioUltMod = usuarioUltMod;
        this.estadoRe = estadoRe;
        this.codHot = codHot;
        this.codSup = codSup;
        this.sueldo = sueldo;
    }

    public void registrarReserva() {

    }

    public void cancelarReserva() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Date getFecNac() {
        return fecNac;
    }

    public void setFecNac(Date fecNac) {
        this.fecNac = fecNac;
    }

    public Date getFecReg() {
        return fecReg;
    }

    public void setFecReg(Date fecReg) {
        this.fecReg = fecReg;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getFecUltMod() {
        return fecUltMod;
    }

    public void setFecUltMod(Date fecUltMod) {
        this.fecUltMod = fecUltMod;
    }

    public String getUsuarioUltMod() {
        return usuarioUltMod;
    }

    public void setUsuarioUltMod(String usuarioUltMod) {
        this.usuarioUltMod = usuarioUltMod;
    }

    public int getEstadoRe() {
        return estadoRe;
    }

    public void setEstadoRe(int estadoRe) {
        this.estadoRe = estadoRe;
    }

    public String getCodHot() {
        return codHot;
    }

    public void setCodHot(String codHot) {
        this.codHot = codHot;
    }

    public String getCodSup() {
        return codSup;
    }

    public void setCodSup(String codSup) {
        this.codSup = codSup;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
