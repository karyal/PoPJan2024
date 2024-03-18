package jdbc_v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteRecord {
	
	public static void main(String []args) {
		
		final String DRIVER = "com.mysql.cj.jdbc.Driver";
		final String HOST = "localhost";
		final int PORT = 3306;
		final String DBNAME="SectionA";
		final String URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+DBNAME;
		final String USER="root";
		final String PASS="pcps@123";
		final String sql ="DELETE FROM persons WHERE pid=1;";
		//final String sql ="DELETE FROM persons WHERE email='abc@gmail.com';";
		
		try {
			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL);
			Statement stat=conn.createStatement();
			stat.executeUpdate(sql);
			stat.close();
			conn.close();
			System.out.println("Record delete");			
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
}