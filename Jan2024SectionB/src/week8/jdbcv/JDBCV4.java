package week8.jdbcv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCV4 {
	//persons (pid, fullname, address, email)
	
	public static void insertRecord(Person person) {
		final String DRIVER="com.mysql.cj.jdbc.Driver";
		final String HOST ="localhost";
		final int PORT =3306;
		final String DATABASE="SectionB";
		final String URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
		final String USER = "root";
		final String PASS = "pcps@123";
		final String sql="insert into persons values("+person.getPid()+",'"+person.getFullname()+"', '"+person.getAddress()+"','"+person.getEmail()+"');";
		
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
	public static void selectAll() {
		final String DRIVER="com.mysql.cj.jdbc.Driver";
		final String HOST ="localhost";
		final int PORT =3306;
		final String DATABASE="SectionB";
		final String URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
		final String USER = "root";
		final String PASS = "pcps@123";
		final String sql="SELECT * FROM persons;";
		
		try {
			Class.forName(DRIVER); //Loading Driver
			Connection conn = DriverManager.getConnection(URL, USER, PASS);//Connect
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(sql); //Select
			System.out.println("PID\tNAME\t\tADDRESS\t\tEMAIL");
			while(rs.next()) {
				System.out.print(rs.getInt("pid")+"\t");
				System.out.print(rs.getString("fullname")+"\t\t");
				System.out.print(rs.getString("address")+"\t\t");
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
	
	public static void searchRecord(int pid) {
		final String DRIVER="com.mysql.cj.jdbc.Driver";
		final String HOST ="localhost";
		final int PORT =3306;
		final String DATABASE="SectionB";
		final String URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
		final String USER = "root";
		final String PASS = "pcps@123";
		final String sql="SELECT * FROM persons WHERE pid="+pid;
		
		try {
			Class.forName(DRIVER); //Loading Driver
			Connection conn = DriverManager.getConnection(URL, USER, PASS);//Connect
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(sql); //Select
			System.out.println("PID\tNAME\t\tADDRESS\t\tEMAIL");
			while(rs.next()) {
				System.out.print(rs.getInt("pid")+"\t");
				System.out.print(rs.getString("fullname")+"\t\t");
				System.out.print(rs.getString("address")+"\t\t");
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
	public static void updateRecord(Person person) {
		final String DRIVER="com.mysql.cj.jdbc.Driver";
		final String HOST ="localhost";
		final int PORT =3306;
		final String DATABASE="SectionB";
		final String URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
		final String USER = "root";
		final String PASS = "pcps@123";
		//final String sql = "UPDATE persons SET fullname='new name' WHERE pid=1";
		//final String sql = "UPDATE persons SET fullname='new name', address='new address' WHERE pid=1";
		final String sql = "UPDATE persons SET fullname='"+person.getFullname()+"', address = '"+person.getAddress()+"', email='"+person.getEmail()+"' WHERE pid ="+person.getPid();
		try {
			Class.forName(DRIVER); //Loading Driver
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stat = conn.createStatement();
			stat.executeUpdate(sql);
			System.out.println("Updated!");
			stat.close();
			conn.close();
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
	public static void deleteRecord(int pid) {
		final String DRIVER="com.mysql.cj.jdbc.Driver";
		final String HOST ="localhost";
		final int PORT =3306;
		final String DATABASE="SectionB";
		final String URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
		final String USER = "root";
		final String PASS = "pcps@123";
		//final String sql = "UPDATE persons SET fullname='new name' WHERE pid=1";
		//final String sql = "UPDATE persons SET fullname='new name', address='new address' WHERE pid=1";
		final String sql = "DELETE FROM persons WHERE pid ="+pid;
		try {
			Class.forName(DRIVER); //Loading Driver
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stat = conn.createStatement();
			stat.executeUpdate(sql);
			System.out.println("Deleted!");
			stat.close();
			conn.close();
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
	public static void main(String[] args) {
		//Person person1 = new Person(8, "Name","Address", "Email");
		//insertRecord(person1);
		//selectAll();
		//Search Record
		//searchRecord(8);
		Person person2 = new Person(8, "Prakash Pathak", "Lat", "prakash@gmail.com");
		updateRecord(person2);
		selectAll();
		deleteRecord(8);
		selectAll();
	}
}
