import java.sql.*;

public class InsuranceJDBC {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/login_schema",
                    "root",
                    "trustme22_06"
            );

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM INSURANCE");

            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Patient ID: " + resultSet.getInt("patient_id"));
                System.out.println("Provider Name: " + resultSet.getString("provider_name"));
                System.out.println("Policy Number: " + resultSet.getString("policy_number"));
                System.out.println("Coverage Details: " + resultSet.getString("coverage_details"));
                System.out.println("Expiry Date: " + resultSet.getString("expiry_date"));
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
