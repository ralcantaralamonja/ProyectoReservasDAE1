package Reserva;
import java.sql.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //CONEXION A BASE DE DATOS
        Class.forName("com.mysql.cj.jdbc.Driver");
        String database = "reservas";
        String user = "root";
        String password = "root";

        String url = "jdbc:mysql://localhost:3306/" + database + "?user=" + user + "&password=" + password;
        Connection con = DriverManager.getConnection(url);

        //-----STATEMENT PARA EJECTURAR QUERY Y DEMOSTRAR CONEXION
        Statement statement = con.createStatement();

        String ScriptSQL="Select * From recepcionista";

        ResultSet rs = statement.executeQuery(ScriptSQL);

        while (rs.next()){
            System.out.println(rs.getString("Cod_Re") + " -" + rs.getString("DniRe") + "-" + rs.getString("Nom_Re") + "-" + rs.getString("Ape_Re") + "-" + rs.getString("Sexo") + "-" + rs.getString("CorreoRe") + "-" + rs.getString("CelularRe") + "-" + rs.getDate("Fec_nac") + "-" + rs.getString("Fec_Reg"));
        }



        /*Cliente clienteObj =  new Cliente("Ana","Airas Remacyuna");
        System.out.println(clienteObj.getNombreCliente());

        Habitacion objHabitacion = new Habitacion("matrimonial", 3,"ocupada");
        System.out.println(objHabitacion.getNumPiso()+ " - " + objHabitacion.getTipoHabitacion() + "-" + " Estado de habitación: " + objHabitacion.getDisponibilidadHabitacion());

        Usuario objUsuario = new Usuario(1,"andre","flores","jh@gmail.com","4780750","jr.piura");
        System.out.println(objUsuario.getID_Usuario());*/

    }



}
