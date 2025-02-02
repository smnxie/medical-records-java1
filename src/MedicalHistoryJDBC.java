import java.sql.*;

public class MedicalHistoryJDBC {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/login_schema",
                    "root",
                    "trustme22_06"
            );

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM medical_history");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("patient_id"));
                System.out.println(resultSet.getString("record"));
                System.out.println(resultSet.getString("record_date"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
