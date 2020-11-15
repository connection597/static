package stcticEx; //static변수 테스트 하기

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setstudentName("이지원");
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;
		
		Student studentSon = new Student();
		studentSon.setstudentName("손수경");
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum);
	}

}
