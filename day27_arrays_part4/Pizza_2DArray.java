package day27_arrays_part4;

import java.util.Arrays;

public class Pizza_2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[][] pizzas = {
				
				{"pinneapple","pepperoni"},
				{"anchovies","mushroom","olives"},
				{"4 cheese"},
				{"chicken","tomatoes","onioons"},
				{"green peppers","zuccini","brocoli","spinach","shrimp"}
		};
System.out.println("#####FOR EACH LOOP#####");
System.out.println(Arrays.toString(pizzas[0]));
for(String[] pizza:pizzas) {
	System.out.print(pizza.length + "-");
	System.out.println(Arrays.toString(pizza));
}

System.out.println("#### FOR ITERATOR LOOP###");
for(int i=0;i<pizzas.length;i++) {
	System.out.print(pizzas[i].length + "-");
	System.out.println(Arrays.toString(pizzas[i]));
}

for(String value:pizzas[3]) {
	System.out.println(value);
	
}

int [][]students= {{4,5,6},{12,5,7},{23,56,12,55,3}};
for(int [] group:students) {
	for(int studentID:group) {
		System.out.println(studentID);
	}
}






	}

}
