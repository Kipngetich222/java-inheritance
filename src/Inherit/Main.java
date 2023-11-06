package Inherit;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student john = new Student("Ygoo", "Vic", "LMS","12/U/0",65.5);
		john.printPersonInfo();
		john.printStudentInfo();
		
		Staff james= new Staff("James", "ouma", "Vc");
		james.printPersonInfo();

	}

}
