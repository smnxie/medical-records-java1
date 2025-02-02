import java.sql.*;

public class AppointmentJDBC {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/login_schema",
                    "root",
                    "trustme22_06"
            );

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM APPOINTMENT");

            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Patient ID: " + resultSet.getInt("patient_id"));
                System.out.println("Doctor ID: " + resultSet.getInt("doctor_id"));
                System.out.println("DateTime: " + resultSet.getString("datetime"));
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
