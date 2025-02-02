import java.sql.*;

public class PrescriptionJDBC {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/login_schema",
                    "root",
                    "trustme22_06"
            );

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM prescription");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("patient_id"));
                System.out.println(resultSet.getString("doctor_id"));
                System.out.println(resultSet.getString("medication"));
                System.out.println(resultSet.getString("dosage"));
                System.out.println(resultSet.getString("instructions"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

