package day23_lab3;

import java.util.*;

public class Task_83 {

	public static void main(String[] args) {
		int dice1;
		int dice2;
		String again="y";
		
		Scanner sc=new Scanner(System.in);
		Random rn=new Random();
		while(again.equalsIgnoreCase("y"))	 {
			
			
			System.out.println("rolling the dice...");
			dice1=rn.nextInt(6)+1;
			dice2=rn.nextInt(6)+1;
			
			System.out.println("their values are: " );
			System.out.println(dice1+" " +dice2);
			
			System.out.println("Roll them again (y=yes)?");
			again=sc.nextLine(); //y Y n
			
			
		}
		
		
		

	}

}
