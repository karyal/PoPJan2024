package jdbc_v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecord {

	public static void main(String[] args) {
		String DRIVER = "com.mysql.cj.jdbc.Driver";
		String HOST = "localhost";
		int PORT =3306;
		String DBNAME="SectionA";
		String URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+DBNAME;
		String USER="root";
		String PASS="pcps@123";
		String sql ="insert into persons values(2,'Raj Sharma','Kalanki','raj@gmail.com');";
		try {
			Class.forName(DRIVER);
			Connection conn=DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Connected!");
			Statement stat = conn.createStatement();
			stat.executeUpdate(sql); //insert, update, delete
			stat.close();
			conn.close();
			System.out.println("Inserted!");
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());//Error Message
		}

	}

}
