package stcticEx; //학번 자동 부여하기

public class Student1 {
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student1() {
		serialNum++; //학생이 생성될때 마다 증가
		studentID = serialNum; // 증가 값이 학번 인스턴스에 부여
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudnetName(String name) {
		studentName = name;
	}

}
