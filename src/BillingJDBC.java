import java.sql.*;

public class BillingJDBC {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/login_schema",
                    "root",
                    "trustme22_06"
            );

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM BILLING");

            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Patient ID: " + resultSet.getInt("patient_id"));
                System.out.println("Appointment ID: " + resultSet.getInt("appointment_id"));
                System.out.println("Amount: " + resultSet.getDouble("amount"));
                System.out.println("Payment Status: " + resultSet.getString("payment_status"));
                System.out.println("Payment Date: " + resultSet.getString("payment_date"));
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

