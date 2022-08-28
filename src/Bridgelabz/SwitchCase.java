package Bridgelabz;

public class SwitchCase {

	public static void main(String[] args) {
		/*
		 * initialize variables
		 */
		int Full_Day_Hour = 1;
		int Part_Time_Hour = 2;
		int Emp_Day_Hour = 0;
		int Wage_Per_Hour = 20;
		
		/*
		 * using random function to generate random numbers
		 */
		int empCheck = (int)(Math.floor(Math.random()*10)%3);
		
		
		switch(empCheck) {
		case 1:
			System.out.println("Employee is Present");
			int Emp_Full_Hour = 8;
			System.out.println("Employee Daily Wage ="+ (Wage_Per_Hour*Emp_Full_Hour));
			break;
		case 2:
			System.out.println("Employee is Part Time");
			int Emp_Part_Hour = 4;
			System.out.println("Employee Daily Wage ="+ (Wage_Per_Hour*Emp_Part_Hour));
			break;
		case 3:
			System.out.println("Employee is Absent");
			int EmployeeAbsent = 0;
			System.out.println("Employee Daily Wage ="+EmployeeAbsent);
			break;
		default:
			System.out.println("Invalid");
		}

	}

}
