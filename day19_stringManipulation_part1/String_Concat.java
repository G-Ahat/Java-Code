
package day19_stringManipulation_part1;

public class String_Concat {

	public static void main(String[] args) {
		
		String word="Java";
		
		System.out.println(word.concat("+selenium"));
		System.out.println(word.concat(" in eclipse"));
		
		System.out.println(word);
		
		word=word.concat("+Eclipse");
		System.out.println(word);
		
		word=word.concat(" automation");
		System.out.println(word);
		
		//word=word.concat(123); // this will not work..concat icine sadece string yazabiliriz
		
		word=word+123; //string+int=string
		System.out.println(word);
		
		String word2="hi";
		word2=word2.concat("-hey").concat("-how are you").concat("-good");
		System.out.println(word2);

	}

}