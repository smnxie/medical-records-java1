import java.sql.*;

public class MYJDBC {
    public static void main(String[] args) {
        try{
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/login_schema",
                    "root",
                    "trustme22_06"
            );

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery ("SELECT * FROM PATIENT");

            while (resultSet.next()){
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getString("contact"));
                System.out.println(resultSet.getString("medical_history"));

            }

        }catch(SQLException e){
            e.printStackTrace();
        }

    }
}
