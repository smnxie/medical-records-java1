import java.sql.*;

public class LabTestsJDBC {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/login_schema",
                    "root",
                    "trustme22_06"
            );

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM LAB_TESTS");

            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Patient ID: " + resultSet.getInt("patient_id"));
                System.out.println("Doctor ID: " + resultSet.getInt("doctor_id"));
                System.out.println("Test Name: " + resultSet.getString("test_name"));
                System.out.println("Test Result: " + resultSet.getString("test_result"));
                System.out.println("Test Date: " + resultSet.getString("test_date"));
                System.out.println("-----------------------------");
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
