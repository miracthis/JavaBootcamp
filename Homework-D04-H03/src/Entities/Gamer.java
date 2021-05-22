package Entities;

public class Gamer {

	private String identityNo;
	private String firstName;
	private String lastName;
	private int birthOfYear;
	
	
	public Gamer(String identityNo, String firstName, String lastName, int birthOfYear) {
		super();
		this.identityNo = identityNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthOfYear = birthOfYear;
	}
	
	public String getIdentityNo() {
		return identityNo;
	}

	public void setIdentityNo(String identityNo) {
		this.identityNo = identityNo;
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

	public int getBirthOfYear() {
		return birthOfYear;
	}

	public void setBirthOfYear(int birthOfYear) {
		this.birthOfYear = birthOfYear;
	}

	
	
	
	
}
