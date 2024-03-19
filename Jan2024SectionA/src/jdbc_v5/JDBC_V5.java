spackage jdbc_v5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class JDBC_V5 {
	//persons (pid - pk, fullname, address, email)
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
	//persons (pid, fullname, address, email)
	public boolean insertRecord(Person person) {
		final String DRIVER="com.mysql.cj.jdbc.Driver";
		final String DBNAME="MyDB";
		final String DBUSER="root";
		final String USERPASS="pcps@123";
		final int PORT = 3306;
		final String HOST = "localhost";
		final String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DBNAME;
		final String sql = "insert into persons values("+person.getPid()+",'"+person.getFullname()+"', '"+person.getAddress()+"','"+person.getEmail()+"');";
		boolean result = false;
		
		try {
			//Connect
			Connection conn = DriverManager.getConnection(URL, DBUSER, USERPASS);
			Statement stat= conn.createStatement();
			stat.executeUpdate(sql); //insert record
			stat.close();
			conn.close();
			System.out.println("Record inserted!");
			result=true;
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		return result;
	}
	
	public  ArrayList<Person> selectAll() {
		final String DRIVER="com.mysql.cj.jdbc.Driver";
		final String DBNAME="MyDB";
		final String DBUSER="root";
		final String USERPASS="pcps@123";
		final int PORT = 3306;
		final String HOST = "localhost";
		final String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DBNAME;
		final String sql ="SELECT * FROM persons;";
		
		ArrayList<Person> persons = new ArrayList<Person>();
		
		try {
			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, DBUSER, USERPASS);
			//display records
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			
			while(rs.next()) {
				int pid=rs.getInt("pid");
				String fullname=rs.getString("fullname");
				String address=rs.getString("address");
				String email=rs.getString("email");
				Person tmpPerson=new Person(pid, fullname, address, email);
				persons.add(tmpPerson);
			}
			rs.close();
			stat.close();
			conn.close();
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		return persons;
	}
	
	public static void searchRecord(int pid) {
		final String DRIVER="com.mysql.cj.jdbc.Driver";
		final String DBNAME="MyDB";
		final String DBUSER="root";
		final String USERPASS="pcps@123";
		final int PORT = 3306;
		final String HOST = "localhost";
		final String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DBNAME;
		final String sql ="SELECT * FROM persons WHERE pid="+pid;
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
									rs.getString("email"));
			}
			rs.close();
			stat.close();
			conn.close();
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
	
	public static void updateRecord(Person person) {
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
		final String sql = "UPDATE persons SET fullname='"+person.getFullname()+"', address='"+person.getAddress()+"', email='"+person.getEmail()+"' WHERE pid="+person.getPid();
		try {
			//Connect
			Connection conn = DriverManager.getConnection(URL, DBUSER, USERPASS);
			Statement stat= conn.createStatement();
			stat.executeUpdate(sql); //insert record
			stat.close();
			conn.close();
			System.out.println("Record Updated!");
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
	
	public static void deleteRecord(int pid) {
		final String DRIVER="com.mysql.cj.jdbc.Driver";
		final String DBNAME="MyDB";
		final String DBUSER="root";
		final String USERPASS="pcps@123";
		final int PORT = 3306;
		final String HOST = "localhost";
		final String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DBNAME;
		final String sql = "DELETE FROM persons WHERE pid="+pid;
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
		//insertRecord(5, "Your name", "Your Address", "Your email");
		//insertRecord(6, "Your name", "Your Address", "Your email");
		//selectAll()
		//searchRecord(1);
		//updateRecord(1, "New Name","New Address", "New Email");
		//deleteRecord(3)
	}
}
