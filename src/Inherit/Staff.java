package Inherit;

public class Staff extends Person {
private String jobTitle;
private double salary;

public Staff(String fName, String lName, String jobTitle, double salary) {
	super (fName,lName);
	this.jobTitle=jobTitle;
	this.salary=salary;
}

public void printStaffInfo() {
	System.out.println("Job Title: "+ jobTitle);
	System.out.println("Salary: "+ salary);
}
}
