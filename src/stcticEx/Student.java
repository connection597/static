package stcticEx; //static변수 사용하기

public class Student {
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setstudentName(String name) {
		studentName =name;
	}

}
