package Assignment_3;

public class task_71 {

	public static void main(String[] args) {

		calcFeetAndInchesToCentimeters(100);

	}
	public static double calcFeetAndInchesToCentimeters(double feet,double inches) {
		if (feet<0||(inches<0||inches>12)) {
			System.out.println("invalid feet or inches");
			return -1;
		}
		
		
		double centimeters=(feet*12)*2.54;
		System.out.println(feet + "feet," + inches + " inches=" + centimeters + " centimeters");
		return centimeters;
		
	} 
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
		
		if(inches<0) {
			return -1;
		}
		
		double feet=(int)inches/12;
		double remainingInches=inches%12;
		
		System.out.println(inches + " inches=" + feet + " feet and " + remainingInches + "inches");
		return calcFeetAndInchesToCentimeters(feet, remainingInches);
	}

}
