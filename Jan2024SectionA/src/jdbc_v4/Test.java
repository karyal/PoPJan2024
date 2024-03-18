package jdbc_v4;

public class Test {

	public static void main(String[] args) {
		Person person1 = new Person(21, "Name", "Address", "Email");
		new JDBC_V4().insertRecord(person1);
	}

}
