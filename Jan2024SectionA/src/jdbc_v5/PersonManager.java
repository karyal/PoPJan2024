package jdbc_v5;

import java.util.ArrayList;

public class PersonManager {
	public boolean insertRecord(Person person) {
		return new JDBC_V5().insertRecord(person);
	}
	public ArrayList<Person> selectAll() {
		return new JDBC_V5().selectAll();
	}
	public Person searchRecord(int pid) {
		return new JDBC_V5().searchRecord(pid);
	}
	public boolean updateRecord(Person person) {
		return new JDBC_V5().updateRecord(person);
	}
}
