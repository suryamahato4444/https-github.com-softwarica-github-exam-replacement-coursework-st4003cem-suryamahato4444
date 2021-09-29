package swingexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class ConNection {
    public static void insert(int final_result) throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/surya_cal", "root", "surya4444");
        Statement stmt = connection.createStatement();
//        String query = "insert into user_tbl(final_result) values (final_result);";
//        System.out.println(query);
        stmt.execute("insert into user_tbl(final_result) values ('" + final_result + ");");
    }
}
