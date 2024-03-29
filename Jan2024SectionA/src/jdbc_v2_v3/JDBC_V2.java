package jdbc_v2_v3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_V2 {
	
	public static void connect() {
		final String DRIVER="com.mysql.cj.jdbc.Driver";
		final String DBNAME="MyDB";
		final String DBUSER="root";
		final String USERPASS="pcps@123";
		final int PORT = 3306;
		final String HOST = "localhost";
		final String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DBNAME;
		try {
			Connection conn = DriverManager.getConnection(URL, DBUSER, USERPASS);
			System.out.println("Connected!");
			conn.close();
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
	
	public static void insertRecord() {
		final String DRIVER="com.mysql.cj.jdbc.Driver";
		final String DBNAME="MyDB";
		final String DBUSER="root";
		final String USERPASS="pcps@123";
		final int PORT = 3306;
		final String HOST = "localhost";
		final String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DBNAME;
		final String sql = "insert into persons values(1,'Raj Rai', 'Balkhu','raj@gmail.com');";
		
		try {
			//Connect
			Connection conn = DriverManager.getConnection(URL, DBUSER, USERPASS);
			Statement stat= conn.createStatement();
			stat.executeUpdate(sql); //insert record
			stat.close();
			conn.close();
			System.out.println("Record inserted!");
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
	
	public static void selectAll() {
		final String DRIVER="com.mysql.cj.jdbc.Driver";
		final String DBNAME="MyDB";
		final String DBUSER="root";
		final String USERPASS="pcps@123";
		final int PORT = 3306;
		final String HOST = "localhost";
		final String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DBNAME;
		final String sql ="SELECT * FROM persons;";
		//persons(pid, fullname, address, email)
		try {
			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, DBUSER, USERPASS);
			//display records
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			System.out.println("PID\tNAME\t\tADDRESS\t\tEMAIL");//title row
			while(rs.next()) {
				System.out.println(rs.getInt("pid")+"\t"+
							rs.getString("fullname")+"\t\t"+
								rs.getString("address")+"\t\t"+
									rs.getString("emil"));
			}
			rs.close();
			stat.close();
			conn.close();
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
	
	public static void searchRecord() {
		final String DRIVER="com.mysql.cj.jdbc.Driver";
		final String DBNAME="MyDB";
		final String DBUSER="root";
		final String USERPASS="pcps@123";
		final int PORT = 3306;
		final String HOST = "localhost";
		final String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DBNAME;
		final String sql ="SELECT * FROM persons WHERE pid=1;";
		//persons(pid, fullname, address, email)
		try {
			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, DBUSER, USERPASS);
			//display records
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			System.out.println("PID\tNAME\t\tADDRESS\t\tEMAIL");//title row
			while(rs.next()) {
				System.out.println(rs.getInt("pid")+"\t"+
							rs.getString("fullname")+"\t\t"+
								rs.getString("address")+"\t\t"+
									rs.getString("emil"));
			}
			rs.close();
			stat.close();
			conn.close();
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
	
	public static void updateRecord() {
		final String DRIVER="com.mysql.cj.jdbc.Driver";
		final String DBNAME="MyDB";
		final String DBUSER="root";
		final String USERPASS="pcps@123";
		final int PORT = 3306;
		final String HOST = "localhost";
		final String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DBNAME;
		//final String sql = "UPDATE persons SET fullname='New Name' WHERE pid=1";
		//final String sql = "UPDATE persons SET address='New address' WHERE pid=1";
		//final String sql = "UPDATE persons SET email='New email' WHERE pid=1";
		final String sql = "UPDATE persons SET fullname='New Name', address='New address', email='New Email' WHERE pid=1";
		try {
			//Connect
			Connection conn = DriverManager.getConnection(URL, DBUSER, USERPASS);
			Statement stat= conn.createStatement();
			stat.executeUpdate(sql); //insert record
			stat.close();
			conn.close();
			System.out.println("Record inserted!");
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
	
	public static void deleteRecord() {
		final String DRIVER="com.mysql.cj.jdbc.Driver";
		final String DBNAME="MyDB";
		final String DBUSER="root";
		final String USERPASS="pcps@123";
		final int PORT = 3306;
		final String HOST = "localhost";
		final String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DBNAME;
		final String sql = "DELETE FROM persons WHERE pid=1";
		try {
			//Connect
			Connection conn = DriverManager.getConnection(URL, DBUSER, USERPASS);
			Statement stat= conn.createStatement();
			stat.executeUpdate(sql); //insert record
			stat.close();
			conn.close();
			System.out.println("Record inserted!");
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
	public static void main(String[] args) {
		//connect();
		//insertRecord()
		//selectAll()
		//searchRecord()
		//updateRecord()
		//deleteRecord()
		//insertRecord()
	}
}
