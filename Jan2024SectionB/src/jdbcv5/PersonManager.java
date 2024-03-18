package jdbcv5;

import java.util.ArrayList;

public class PersonManager {
	public void insertRecord(Person person) {
		new JDBCV5().insertRecord(person);
	}
	public ArrayList selectAll() {
		return new JDBCV5().selectAll();
	}
}
