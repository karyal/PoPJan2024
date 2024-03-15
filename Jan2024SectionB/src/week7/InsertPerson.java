package week7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertPerson {

	public static void main(String[] args) {
		final String DRIVER="com.mysql.cj.jdbc.Driver";
		final String HOST ="localhost";
		final int PORT =3306;
		final String DATABASE="SectionB";
		final String URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
		final String USER = "root";
		final String PASS = "pcps@123";
		final String sql="insert into persons values(2,'Roshan Sharma', 'Thapathali','roshan@gmail.com');";
		
		try {
			Class.forName(DRIVER); //Loading Driver
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Connected!");
			Statement stat = conn.createStatement();
			stat.executeUpdate(sql);
			System.out.println("Inserted!");
			stat.close();
			conn.close();
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
}