package Bridgelabz;

public class PartTimeEmployeeWage {

	public static void main(String[] args) {
		/*
		 * initialize variables
		 */
		int Full_Day_Hour = 1;
		int Part_Time_Hour = 2;
		int Wage_Per_Hour = 20;
		
		/*
		 * using random function to generate random numbers
		 */
		int empCheck = (int)Math.floor(Math.random()*10)%3;
		
		if(empCheck == Full_Day_Hour) {
			System.out.println("Employee is Present");
			int Emp_Full_Hour = 8;
			System.out.println("Employee Daily Wage ="+ (Wage_Per_Hour*Emp_Full_Hour));
		}else if (empCheck == Part_Time_Hour) {
			System.out.println("Employee is Part Time");
			int Emp_Part_Hour = 4;
			System.out.println("Employee Daily Wage ="+ (Wage_Per_Hour*Emp_Part_Hour));
		}else {
			System.out.println("Employee is Absent");
			int EmployeeAbsent = 0;
			System.out.println("Employee Daily Wage =" +EmployeeAbsent);
		}

	}

}
