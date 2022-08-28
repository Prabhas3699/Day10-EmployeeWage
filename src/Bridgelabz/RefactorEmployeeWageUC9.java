package Bridgelabz;

public class RefactorEmployeeWageUC9 {
	
     /*
      * initialize variables
      */
	int Full_Day_Hour = 1;
    int Part_Time_Hour = 2;
    int Emp_Day_Hour = 0;
    int hour=0;
    int day=0;
    
    int wage_Per_Hour;
    int totalHours;
    int totalDays;
    String companyName;
   
   /*
	 * @param wage_Per_Hour
	 * @param totalHours
	 * @param totalDays
	 * @param companyName
	 */
	public RefactorEmployeeWageUC9(String companyName, int wage_Per_Hour, int totalHours, int totalDays) {
		super();
		this.wage_Per_Hour = wage_Per_Hour;
		this.totalHours = totalHours;
		this.totalDays = totalDays;
		this.companyName = companyName;
	}
	
	/*
	 * initializing the method
	 */
    public void  calculateTotalWage(){
    	
         System.out.println("Total wage of Employee of "+companyName+" company");
         System.out.println("-----------------------------------------------------");
         
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
    		System.out.println("---------------------");
    		System.out.println("Day:"+ day +"\nHours:"+Emp_Day_Hour);
    		System.out.println("--------------------------------------");
    	}
        System.out.println("Total Working Hours for a Month="+totalHours);
    	System.out.println("Total Working Hours Employee worked for a Month="+hour);
    	System.out.println("Total Working Days for a Month ="+totalDays);
    	System.out.println("Total Working Days Employee worked for a Month ="+day);	
    	System.out.println("Employe Wages For  Month ="+(hour*wage_Per_Hour));
    	System.out.println("-----------------------------------------------------");
    	System.out.println("-----------------------------------------------------");
    }
}

