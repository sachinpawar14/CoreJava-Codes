package session_04;

public class Student {
	
	private int rollNo;
	private String firstName;
	private String lastName;
	private float percentage;
	
	public Student(int rollNo, String firstName, String lastName, float percentage) {
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.percentage = percentage;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	
	public String toString() {
		return "Student [rollNo=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName + ", percentage="
				+ percentage + "]";
	}
	
	
	
	

}
