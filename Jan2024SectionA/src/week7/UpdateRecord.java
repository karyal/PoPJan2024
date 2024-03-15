package week7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateRecord {
	
	public static void main(String []args) {
		final String DRIVER = "com.mysql.cj.jdbc.Driver";
		final String HOST = "localhost";
		final int PORT = 3306;
		final String DBNAME="SectionA";
		final String URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+DBNAME;
		final String USER="root";
		final String PASS="pcps@123";
		final String sql ="UPDATE persons SET fullname='Raj Kumar Rai' WHERE pid=1;";
		
		try {
			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stat = conn.createStatement();
			stat.executeUpdate(sql);
			stat.close();
			conn.close();
			System.out.println("Record update!");
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
}
