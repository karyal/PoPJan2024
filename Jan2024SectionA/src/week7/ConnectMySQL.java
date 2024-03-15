package week7;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectMySQL {
	
	public static void main(String[] args) {
		//Connect with MySQL	
		//declare
		String DRIVER="com.mysql.cj.jdbc.Driver";
		String DBNAME="MyDB";
		String DBUSER="root";
		String USERPASS="pcps@123";
		int PORT = 3306;
		String HOST = "localhost";
		String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DBNAME;
		
		try {
			Class.forName(DRIVER);//Loading driver
			Connection conn = DriverManager.getConnection(
					URL, DBUSER, USERPASS); //Connect
			System.out.println("Connect with mysql server successfully");
			conn.close();//
		}
		catch(Exception ex) {
			//Display error message
			System.out.println("Error : "+ex.getMessage());
		}
		
		//Insert Record on MySQL Table
		

	}

}
