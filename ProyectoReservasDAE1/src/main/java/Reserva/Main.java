package Reserva;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String database = "reservas";
        System.out.println("Oh baby i miss you");
        String url = "jdbc:mysql://localhost:3306/myDb user1 pass";
        Connection con = DriverManager.getConnection(url);

        Recepcionista recepcionista1 = new Recepcionista("Juan","Perez","JP");
        System.out.println(recepcionista1.getNombre());
    }
}
