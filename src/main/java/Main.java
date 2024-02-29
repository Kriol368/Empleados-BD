import java.sql.SQLException;
import java.sql.*;

public class Main {
    private static java.sql.Connection con;

    public static void main(String[] args) throws SQLException {
        String host = "jdbc:sqlite:src/main/resources/empleados";
        con = java.sql.DriverManager.getConnection(host);
        //crearTabla();
        añadirEmpleados();
    }

    public static void crearTabla() throws SQLException {
        Statement st = con.createStatement();
        st.executeUpdate("CREATE TABLE empleado ( num INTEGER PRIMARY KEY,  nombre VARCHAR(255), departamento INTEGER, edad INTEGER, sueldo REAL)");
    }
    public static void añadirEmpleados() throws SQLException{
        Statement st = con.createStatement();
        st.executeUpdate("INSERT INTO empleado values " +
                "(1,'Andreu',10,32,1000.00), " +
                "(2,'Bernat',20,28,1200.00), " +
                "(3,'Claudia',10,26,1100.00)," +
                "(4,'Damia',10,40,  1500.00)");
    }
}
