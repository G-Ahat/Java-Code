package day20_stringManipulation_part2;

public class String_Replace2 {

	public static void main(String[] args) {
		
		String sentence="Coding is fun, it is my hobby!!";
		String withNoSpace= sentence.replace(" ","");
		System.out.println(withNoSpace);
		
		//replace , with !!!
		
		String newsen=sentence.replace(",","!!!");
		System.out.println(newsen);
		
		String mixed="&^@#j$a-v|a@#$";
		mixed=mixed.replace("&^@#String re","");
		System.out.println(mixed);
		
		String result="About 8,930,000,000 results (0.68 seconds)";
		
		result=result.replace("About","");
		System.out.println(result);
		result=result.replace("results", "");
		System.out.println(result);
		result=result.replace("(0.68 seconds)","");
		System.out.println(result);
		result=result.replace(" ","");
		System.out.println(result);

	}

}
