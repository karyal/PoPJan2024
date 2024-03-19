package jdbc_v5;

public class Test {
	public static void main(String[] args) {
		
		//Insert Record
		boolean result = false;
		Person person = new Person(31, "Kripa Rai", "Lat", "kripa@gmail.com");
		result = new PersonManager().insertRecord(person);
		if(result) {
			System.out.println("Inserted!");
		}
		else {
			System.out.println("Error to insert");
		}
	}
}
