import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDataRetrieval {

    private static final String URL = "jdbc:mysql://localhost:3306/employee_db";
    private static final String USER = "root";  
    private static final String PASSWORD = "password";  

    private static Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error connecting to the database.");
            e.printStackTrace();
            throw e;  
        }
        return connection;
    }

    public static void getEmployees() {
        String query = "SELECT * FROM employees";

        try (Connection connection = getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            System.out.printf("%-5s %-20s %-20s %-10s%n", "ID", "Name", "Position", "Salary");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String position = resultSet.getString("position");
                double salary = resultSet.getDouble("salary");

                System.out.printf("%-5d %-20s %-20s %-10.2f%n", id, name, position, salary);
            }

        } catch (SQLException e) {
            System.out.println("Error retrieving employee data.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        getEmployees();
    }
}
