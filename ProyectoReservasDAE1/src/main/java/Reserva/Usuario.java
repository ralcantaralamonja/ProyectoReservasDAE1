package Reserva;

public class Usuario {
    private int ID_Usuario;
    private String Nombre;
    private String Apellido;
    private String Correo;
    private String teléfono;
    private String Dirección;


    public Usuario(int ID_Usuario,String Nombre, String Apellido, String Correo, String teléfono, String Dirección){
        this.ID_Usuario = ID_Usuario;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Correo = Correo;
        this.teléfono = teléfono;
        this.Dirección = Dirección;

    }

    public int getID_Usuario() {
        return ID_Usuario;
    }

    public void setID_Usuario(int ID_Usuario) {
        this.ID_Usuario = ID_Usuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    public String getDirección() {
        return Dirección;
    }

    public void setDirección(String dirección) {
        Dirección = dirección;
    }

}