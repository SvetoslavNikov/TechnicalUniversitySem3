package learning.javaAdvanced.jdbcExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCExample {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "password";


        String query = "SELECT id, name, email FROM users WHERE status = ?";


        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // Step 1: Register JDBC driver (optional for modern Java)
            Class.forName("com.mysql.cj.jdbc.Driver"); // For MySQL (replace as needed for other DBs)

            // Step 2: Establish connection
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");

            // Step 3: Create PreparedStatement
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "active"); // Setting parameter value

            // Step 4: Execute query and process the ResultSet
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
            }
        } catch (Exception e) {

            e.printStackTrace();
        } finally {
            try {
                // Step 5: Close resources
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
