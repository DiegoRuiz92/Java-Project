
import java.sql.*;

class Conexion {

    Connection conectar = null;

    public Connection conectar() {
        try {
            //Class.forName("org.slite.JDBC");
            //conectar = DriverManager.getConnection("jdbc:sqlite:colegio.db");
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://www.db4free.net/cinema_culto", "cinema_culto", "cinema555");
            //conectar = DriverManager.getConnection("jdbc:mysql://localhost/cinema_culto","root","");
        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }
        return conectar;
    }

}
