package Inherit;

public class Person{
	protected String firstName;
	protected String lastName;
	
	public Person(String fName, String lName) {
		this.firstName=fName;
		this.lastName=lName;
	}
	
	public void printPersonInfo () {
		System.out.println("Full Name.:" + firstName+ " " +lastName);
	}
	
}


