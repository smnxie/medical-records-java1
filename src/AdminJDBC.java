import java.sql.*;

public class AdminJDBC {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/login_schema",
                    "root",
                    "trustme22_06"
            );

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM admin");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("username"));
                System.out.println(resultSet.getString("password_hash"));
                System.out.println(resultSet.getString("role"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
