package week8.jdbcv5;

public class PersonManager {
	public void insertRecord(Person person) {
		new JDBCV5().insertRecord(person);
	}
}
