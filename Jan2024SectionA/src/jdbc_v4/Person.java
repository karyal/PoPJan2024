package jdbc_v4;

//Person(pid, fullname, address, email)
public class Person {
	//Instance Variables
	private int pid;
	private String fullname;
	private String address;
	private String email;
	
	public Person() {
		this.pid = 0;
		this.fullname = "";
		this.address = "";
		this.email = "";
	}
	
	public Person(int pid, String fullname, String address, String email) {
		this.pid = pid;
		this.fullname = fullname;
		this.address = address;
		this.email = email;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", fullname=" + fullname + ", address=" + address + ", email=" + email + "]";
	}
}
