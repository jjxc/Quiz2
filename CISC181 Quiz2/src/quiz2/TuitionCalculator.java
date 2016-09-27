package quiz2;

import java.util.Scanner;

public class TuitionCalculator {
		
		//Start
		public static void main(String[] args){
		
		//Scanner
		try(Scanner input = new Scanner( System.in )){
		
		//Variables
		double tuition; 
		double percent;
		
		//Inputs
		System.out.print("How much is your first-year tuition?: ");
	    tuition = input.nextDouble();
	    
	    System.out.print("What is the percentage increase in price per year?: ");
	    percent = input.nextDouble();
	    
	    //For Loop Calculations
	    double sum = 0;
	    for(int i = 0; i < 4; i++) {
	    	
	    	sum += (tuition * (Math.pow(1+percent,i)));
	    }
		
	    //Output
	    System.out.printf("The total tuition cost to complete your degree is: $%.2f \n", +sum);
		}
		
		}
}
