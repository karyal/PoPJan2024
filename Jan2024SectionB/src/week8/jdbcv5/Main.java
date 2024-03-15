package week8.jdbcv5;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person(9, "Aditi Sharma", "Thapathali", "adi@gmai.com");
		p1.setFullname("Aditi Thapa");
		System.out.println(p1); //toString()
		new PersonManager().insertRecord(p1);

	}

}
