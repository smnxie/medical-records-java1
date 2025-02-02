import java.sql.*;

public class MessagesJDBC {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/login_schema",
                    "root",
                    "trustme22_06"
            );

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM MESSAGES");

            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Sender ID: " + resultSet.getInt("sender_id"));
                System.out.println("Receiver ID: " + resultSet.getInt("receiver_id"));
                System.out.println("Message: " + resultSet.getString("message"));
                System.out.println("Sent At: " + resultSet.getString("sent_at"));
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
