package Bridgelabz;

public class WageForMonth {
	public static void main(String[] args) {

	/*
	 * initialize variables
	 */
	int Full_Day_Hour = 1;
	int Part_Time_Hour = 2;
	int Emp_Day_Hour = 0;
	int Wage_Per_Hour = 20;
	int days=20;
	int hour=0;
	
	for(int day = 1;day<=days; day++){
	
		/*
		 * using random function to generate random numbers
		 */
		int empCheck = (int)Math.floor(Math.random()*10)%3;
	
		if(empCheck == Full_Day_Hour){
			Emp_Day_Hour = 8;
			System.out.println("Employee is Present");
		
		}else if(empCheck == Part_Time_Hour) {
			Emp_Day_Hour = 4;
			System.out.println("Employee is Part Time");
		
		}else {
			Emp_Day_Hour = 0;
			System.out.println("Employee is Absent");
	
		}
		hour+=Emp_Day_Hour;
		System.out.println("Day:"+day+"\nHours:"+Emp_Day_Hour);
		System.out.println("Employe Wage ="+ Emp_Day_Hour*Wage_Per_Hour);
		System.out.println("--------------------------------------");
	}
	System.out.println("Employe Wage for month ="+ hour*Wage_Per_Hour);
	System.out.println("--------------------------------------");
	}

}
