package day22_stringManipulation_Lab;

public class Q9 {

	public static void main(String[] args) {
		System.out.println(right2("Hello"));
		System.out.println(right2("java"));
		

	}
   
	public static String right2(String str) {
		if(str.length()>=2) {
			return str.substring(str.length()-2).concat(str.substring(0,str.length()-2));
		}else 
			return "invalid String";
		}
}
