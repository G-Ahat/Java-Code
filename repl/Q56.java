package repl;

import java.util.Scanner;

public class Q56 {

	public static void main(String[] args) {
		//First ask user for a screen size. If screen size is equals to 13.3, add  $200 to the laptop price. 
		//If screen size is equals to  15.0 - add  $300 to the laptop price. If screen size is equals to  17.3 - add  $400 to the laptop price.  
		//Then ask user for CPU type. If CPU type equals to i3, add  $150 to the laptop price. 
		//If CPU type equals to i5, add  $250 to the laptop price. If CPU type equals to i7, add  $350 to the laptop price. 
		//Then ask user for RAM size. Add  $50 for every 4GB of ram to the laptop price. Then, ask user for storage type. 
		//There are 2 options: SSD and HDD. If it's HDD - add $50 to the laptop price for every 500gb.  
		//If it's SSD - add $100 to the laptop price for every 500GB. Then ask user for for screen resolution. 
		//There are 2 options: FULLHD and 4K. Add $100 if it's FULLHD screen and $200 if it's 4K screen.

		double price = 0;
		String storageType, screenType, cpu;
		int ram = 0 ;
		Scanner scan = new Scanner(System.in);
		System.out.println("Select screen size:");
		double scSize=scan.nextDouble();
		if(scSize==13.3) {
			price+=200;
		}else if(scSize==15.0) {
			price+=300;
		}else if(scSize==17.3) {
			price+=400;
		}else {
			System.out.println("wrong input!");
		}
		System.out.println("Select CPU type:");
		cpu=scan.next();
		if(cpu.equals("i3")) {
			price+=150;
		}else if(cpu.equals("i5")) {
			price+=250;
		}else if(cpu.equals("i7")) {
			price+=350;
		}else {
			System.out.println("wrong input!");
		}
		
		System.out.println("Select RAM size:");
		int ramSize=scan.nextInt();
		price+=(ramSize/4)*50;
		
		System.out.println("Select storage type:");
		storageType=scan.next();
		if(storageType.equals("SSD")) {
			System.out.println("Enter memory size:");
			int memorySize=scan.nextInt();
			price+=(memorySize/500)*100;
		}else if(storageType.equals("HDD")) {
			System.out.println("Enter memory size:");
			int memorySize=scan.nextInt();
			price+=(memorySize/500)*50;
			
		}else {
			System.out.println("wrong input!");
		}
		
		System.out.println("Enter screen resolution:");
		String scResol=scan.next();
		if(scResol.contentEquals("FULLHD")) {
			price+=100;
		}else if(scResol.contentEquals("4K"));{
			price+=200;
		}
		    
		   
			
		
		System.out.println("Laptop price is: " + price);
		
		
		
		
		
		}
		
	}


