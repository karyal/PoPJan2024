package jdbc_sqlite;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectSQLite {

	public static void main(String[] args) {
		String DB_FILE = "D:\\MyDocuments\\Learning\\Java\\JDBC\\SQliteDB\\MyDB2.db";
		String URL = "jdbc:sqlite:"+DB_FILE;
		Connection conn=null;
		try {
			conn = DriverManager.getConnection(URL);			
			System.out.println("Connected!");
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		finally {
			try {
				if(conn!=null) {
					conn.close();
					System.out.println("Connection closed!");
				}
			}
			catch(Exception ex) {
				System.out.println("Error : "+ex.getMessage());
			}
		}
	}
}