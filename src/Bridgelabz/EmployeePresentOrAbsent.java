package Bridgelabz;

public class EmployeePresentOrAbsent {

	public static void main(String[] args) {
		
		/*
		 * initialize Variables
		 */
		int IS_FULL_TIME = 1;
		
		/*
		 * using random function to generate random number
		 */
		int empCheck = (int)Math.floor(Math.random()*10)%2;
		System.out.println("empCheck="+empCheck);
		
		
		if (empCheck == IS_FULL_TIME) {
			System.out.println("Employee is present");
		}else {
			System.out.println("Employee is absent");
		}
	}
}
