package jdbc_v5;

public class PersonManager {
	public boolean insertRecord(Person person) {
		return new JDBC_V5().insertRecord(person);
	}
}
