package day36_StaticClassMmebers;

public class StudentTest {

	public static void main(String[] args) {
		Student s1=new Student("Mike",30,1234);
		Student s2=new Student("Smith",39,999);
		Student s3=new Student("Ozzy",15,001);
		s1.school="Cybertek2";
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		System.out.println(s1.school);
		System.out.println(Student.school);
		
		
		

	}

}
