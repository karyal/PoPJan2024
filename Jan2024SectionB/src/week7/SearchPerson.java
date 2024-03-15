package week7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SearchPerson {

	public static void main(String[] args) {
		final String DRIVER="com.mysql.cj.jdbc.Driver";//Driver.class
		final String HOST ="localhost";//127.0.0.1 // 192.168.20.55		
		final int PORT = 3306;
		final String DATABASE="SectionB";
		final String USER="root";
		final String PASSWORD = "pcps@123";
		final String URL ="jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
		final String sql = "select * from persons where pid=1;";
		
		try {
			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			while(rs.next()) {
				System.out.print(rs.getInt("pid")+", ");
				System.out.print(rs.getString("fullname")+", ");
				System.out.print(rs.getString("address")+", ");
				System.out.print(rs.getString("email")+", ");
				System.out.println();
			}
			rs.close();
			stat.close();
			conn.close();
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
}