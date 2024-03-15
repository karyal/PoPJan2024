package week7;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectMySQL {
	public static void main(String []args) {
		final String DRIVER="com.mysql.cj.jdbc.Driver";
		final String HOST ="localhost";
		final int PORT =3306;
		final String DATABASE="SectionB";
		final String URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
		final String USER = "root";
		final String PASS = "pcps@123";
		
		//declare
		try {
			Class.forName(DRIVER); //Loading Driver
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Connected!");
			conn.close();
		}
		catch(Exception ex) {
			//error message
			System.out.println("Error : "+ex.getMessage());
		}
	}
}