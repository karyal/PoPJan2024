package week7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdatePerson {

	public static void main(String[] args) {
		final String DRIVER="com.mysql.cj.jdbc.Driver";//Driver.class
		final String HOST ="localhost";//127.0.0.1 // 192.168.20.55		
		final int PORT = 3306;
		final String DATABASE="SectionB";
		final String USER="root";
		final String PASSWORD = "pcps@123";
		final String URL ="jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;		
		final String sql = "update persons set fullname='Raj Kr Rai' where pid=1;";
		try {
			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
			Statement stat = conn.createStatement();
			stat.executeUpdate(sql);
			stat.close();
			conn.close();
			System.out.println("Record Update.");
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}

	}

}
