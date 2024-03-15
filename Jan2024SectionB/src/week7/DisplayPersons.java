package week7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class DisplayPersons {
	
	public static void main(String []args) {
		final String DRIVER="com.mysql.cj.jdbc.Driver";//Driver.class
		final String HOST ="localhost";//127.0.0.1 // 192.168.20.55		
		final int PORT = 3306;
		final String DATABASE="SectionB";
		final String USER="root";
		final String PASSWORD = "pcps@123";
		final String URL ="jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
		final String sql = "select * from persons;";
		try {
			Class.forName(DRIVER);//Loading Driver
			Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Connected!");
			Statement stat=conn.createStatement();
			ResultSet rs = stat.executeQuery(sql);//Run SQL Query
			while(rs.next()) {
				System.out.println(rs.getInt("pid")+", "
						+rs.getString("fullname")+", "
							+rs.getString("address")+", "
								+rs.getString("email"));
			}
			rs.close();
			stat.close();
			conn.close();//Close Connection
			
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
}