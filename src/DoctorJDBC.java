import java.sql.*;

public class DoctorJDBC {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/login_schema",
                    "root",
                    "trustme22_06"
            );

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM doctor");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getString("specialization"));
                System.out.println(resultSet.getString("contact"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
