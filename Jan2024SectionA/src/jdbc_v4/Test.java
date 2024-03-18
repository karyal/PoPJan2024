package jdbc_v4;

public class Test {

	public static void main(String[] args) {
		//Create
		//Person person1 = new Person(21, "Name", "Address", "Email");
		//new JDBC_V4().insertRecord(person1);
		
		//Display All
		//new JDBC_V4().selectAll();
		
		//Search Record based on PID
		//new JDBC_V4().searchRecord(1);
		//new JDBC_V4().searchRecord(1000);
		
		//Search Record based on PID
		new JDBC_V4().searchRecord(1);//if found
		Person tmpPerson=new Person(1 ,"Kiran Sharma", "Balaju", "kiran@gmail.com");
		new JDBC_V4().updateRecord(tmpPerson);
		new JDBC_V4().searchRecord(1);
	}

}
