package swingexamples;
import java.sql.*;

public class JDBC {
	public static void main(String[] args) {
		try {
//			get connection to database
			Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/surya_cal","root","surya4444");
//			create statement
			Statement myState=myConn.createStatement();
			//execute sql query
			ResultSet myRs=myState.executeQuery("select * from surya_cal");
			//Process result set 
			while (myRs.next()) {
				System.out.println(myRs.getString("final_result"));
				
			}
			
		
	}
		catch(Exception exc) {
			exc.printStackTrace();
		}

}
}
