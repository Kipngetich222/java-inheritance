package Inherit;

	class Student extends Person{
		private String course;
		private String regNo;
		private double gpa;
		
		public Student (String fName,String lName, String regNo,String course, double gpa) {
			super (fName, lName);
			this.course=course;
			this.regNo=regNo;
			this.gpa=gpa;
		}
		
		public void printStudentInfo() {
			System.out.println("Reg No: "+ regNo);
			System.out.println("Course: "+ course);
			System.out.println("GPA: "+ gpa);
		}
	}


