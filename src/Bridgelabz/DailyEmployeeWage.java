package Bridgelabz;

public class DailyEmployeeWage {
	public static void main(String[] args) {
		
		/*
		 * initialize variables
		 */
		int IS_FULL_TIME = 1;
		int Wage_Per_Hour = 20;
		int Full_Day_Hour = 8;
		
		/*
		 * using random function to generate random numbers
		 */
		int empCheck = (int)Math.floor(Math.random()*10)%2;
		
		if (empCheck == IS_FULL_TIME) {
			System.out.println("Employee is Present");
			System.out.println("Employee Daily Wage  is "+ (Wage_Per_Hour*Full_Day_Hour) );	
		}else {
			System.out.println("Employee is Absent");
			System.out.println("Employee Daily Wage  = 0");
		}
	}
}
