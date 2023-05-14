package Reserva;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       /* Class.forName("com.mysql.cj.jdbc.Driver");
        String database = "reservas";
        String url = "jdbc:mysql://localhost:3306/myDb user1 pass";
        Connection con = DriverManager.getConnection(url);*/



        Cliente clienteObj =  new Cliente("Ana","Airas Remacyuna");
        System.out.println(clienteObj.getNombreCliente());


        Habitacion objHabitacion = new Habitacion("matrimonial", 3,"ocupada");
        System.out.println(objHabitacion.getNumPiso()+ " - " + objHabitacion.getTipoHabitacion() + "-" + " Estado de habitación: " + objHabitacion.getDisponibilidadHabitacion());

        Usuario objUsuario = new Usuario(1,"andre","flores","jh@gmail.com","4780750","jr.piura");
        System.out.println(objUsuario.getID_Usuario());



    }



}
