import java.sql.*;

public class ADO_Java_SQLServer {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306";  // Removed database name from URL
        String user = "root";
        String password = "admin";

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL Server!");

            // Create Statement and Execute Query
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SHOW DATABASES;");

            // Process Results
            System.out.println("\nAvailable Databases:");
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

            // Close Resources
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
