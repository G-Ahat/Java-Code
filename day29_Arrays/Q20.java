package day29_Arrays;

public class Q20 {

	public static void main(String[] args) {
		int[] x= {1,2,2,2};
		boolean flag=false;
		
		for(int i=0;i<x.length;i++) {
			if(x[i]==2 && x[i+1]==2) {
				flag=true;
				break;
			}
		}
		
		if(flag) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}

	}

}
