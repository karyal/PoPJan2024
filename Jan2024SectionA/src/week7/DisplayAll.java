package week7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class DisplayAll {			
	public static void main(String []args) {
		final String DRIVER="com.mysql.cj.jdbc.Driver";
		final String HOST="localhost";
		final String DATABASE="SectionA";
		final int PORT=3306;
		final String USER="root";
		final String PASSWORD ="pcps@123";
		final String URL ="jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
		final String sql ="select * from persons;"; //SQL Query
		
		try {
			Class.forName(DRIVER); //Loading Driver
			Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);//Connect with MySQL
			//Display All records
			Statement stat=conn.createStatement();
			ResultSet rs = stat.executeQuery(sql); //Run SQL Query						
			while(rs.next()) {
				System.out.print(rs.getInt("pid")+", ");
				System.out.print(rs.getString("fullname")+", ");
				System.out.print(rs.getString("address")+", ");
				System.out.println(rs.getString("email"));
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