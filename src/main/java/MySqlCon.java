import java.sql.*;
public class MySqlCon {
    public static void main(String[] argv) {

        System.out.println("-------- MySQL JDBC Connection Demo ------------");
       
        System.out.println("MySQL JDBC Driver Registered!");
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/jdbc", "root", "");
            System.out.println("SQL Connection to database established!");
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            return;
		} /*
			 * finally { try { if(connection != null) connection.close();
			 * System.out.println("Connection closed !!"); } catch (SQLException e) {
			 * e.printStackTrace(); } }
			 */
    }
}

