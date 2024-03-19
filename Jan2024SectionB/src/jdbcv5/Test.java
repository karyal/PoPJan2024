package jdbcv5;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//Insert Record
		//Person person1 = new Person(31, "Aadarsh Rai", "Kalanki", "ad@gmai.com");
		//new PersonManager().insertRecord(person1);
		//person1 = new Person(31, "Aadarsh Rai", "Kalanki", "ad@gmai.com");
		//new PersonManager().insertRecord(person1);
		
		//Display All Records
		//ArrayList<Person> persons = new PersonManager().selectAll();
		//for(Person person: persons) {
		//	System.out.println(person);
		//}
		
		//Search Record
		int id =9;
		System.out.println("Enter pid : ");
		id = Integer.parseInt(new Scanner(System.in).nextLine());
		Person person = new PersonManager().searchRecord(id);
		if(person!=null) {
			System.out.println(person);
		}
		else {
			System.out.println("Record not found");
		}
	}
}
