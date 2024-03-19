package jdbc_v5;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		
		//Insert Record
		/*
		boolean result = false;
		Person person = new Person(31, "Kripa Rai", "Lat", "kripa@gmail.com");
		result = new PersonManager().insertRecord(person);
		if(result) {
			System.out.println("Inserted!");
		}
		else {
			System.out.println("Error to insert");
		}
		*/

		//Select All Records
		/*
		ArrayList<Person> persons = new PersonManager().selectAll();
		for(Person person:persons) {
			System.out.println(person);
		}
		*/
		
		//Search Record based on PID
		/*
		int pid = 31;
		Person person = new PersonManager().searchRecord(pid);
		if(person!=null) {
			System.out.println(person);
		}
		else {
			System.out.println("Record not found");
		}
		*/
		
		//Update/Edit Record
		/*
		Person person=new Person(31, "Mingso","BHK","ming@gmail.com");
		boolean result = new PersonManager().updateRecord(person);
		if(result) {
			System.out.println("Update record successfully");
		}
		else {
			System.out.println("Error to update record");
		}
		*/
		
		
		
	}
}
