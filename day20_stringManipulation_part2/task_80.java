package day20_stringManipulation_part2;

public class task_80 {

	public static void main(String[] args) {
		checkedString("your order confirmation number is XYZ","confirmation");

	}
	public static void checkedString(String str1,String str2) {
		
		
		if (str1.contains(str2)) {
			System.out.println(str1.indexOf(str2));
			
		}else {
			System.out.println("not found");
		}
	}

}
