package Bridgelabz;

public class RefactorEmployeeWageUC7 {
	/*
	 * creating a method 
	 */
	public void RefactorEmployeeWage() {	
	/*
     * initialize variables
     */
     int Full_Day_Hour = 1;
     int Part_Time_Hour = 2;
     int Emp_Day_Hour = 0;
     int Wage_Per_Hour = 20;
     int totalHours=100;
     int totalDays=20;
     int hour=0;
     int day=0;
     
    while(hour<=totalHours && day<totalDays){
        day++;
        /*
         * using random function to generate random numbers
         */
        double empCheck = Math.floor(Math.random()*10)%3;

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
        hour +=Emp_Day_Hour;
        System.out.println("Day:"+ day +"\nHours:"+Emp_Day_Hour);
        System.out.println("--------------------------------------");
    }
    System.out.println("Total Working Hours for a Month="+hour);
    System.out.println("Total Working Days for a Month ="+day);
    System.out.println("Employe Wages For  Month ="+(hour*Wage_Per_Hour));
    System.out.println("------------------------------------------");
    }
}
