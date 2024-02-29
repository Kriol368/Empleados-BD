import java.sql.SQLException;
import java.sql.*;

public class Main {
    private static java.sql.Connection con;

    public static void main(String[] args) throws SQLException {
        String host = "jdbc:sqlite:src/main/resources/empleados";
        con = java.sql.DriverManager.getConnection(host);
        crearTabla();
    }

    public static void crearTabla() throws SQLException {
        Statement st = con.createStatement();
        st.executeUpdate("CREATE TABLE empleado ( num INTEGER PRIMARY KEY,  nombre VARCHAR(255), departamento INTEGER, edad INTEGER, sueldo REAL)");
    }
}
