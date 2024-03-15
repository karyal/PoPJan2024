package advanced_controls;

public class PersonNew {
	private int personID;
	private String fullName;
	
	public PersonNew(int personID, String fullName) {
		this.personID = personID;
		this.fullName = fullName;
	}
	
	public int getPersonID() {
		return personID;
	}
	
	public void setPersonID(int personID) {
		this.personID = personID;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}	
}