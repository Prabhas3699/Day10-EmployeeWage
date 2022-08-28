package Bridgelabz;

import java.util.ArrayList;

public class RefactorEmployeeWageUC12 {
	/*
     * initialize variables
     */
	int Full_Day_Hour = 1;
	int Part_Time_Hour = 2;
	int Emp_Day_Hour = 0;
	int hour=0;
	int day=0;
	int Wages=0;
	int totalWage=0;
   
	int wage_Per_Hour;
	int totalHours;
	int totalDays;
	String companyName;
	int totalCompanies;
	int i;
	//arraylist of companies
	ArrayList<RefactorEmployeeWageUC12> companies;
	
	/*
	 * @param companies
	 */
	public RefactorEmployeeWageUC12() {
		super();
		this.companies = new ArrayList<>();
	}

	
	/*
	 * @param wage_Per_Hour
	 * @param totalHours
	 * @param totalDays
	 * @param companyName
	 */
	public RefactorEmployeeWageUC12(String companyName, int wage_Per_Hour, int totalHours, int totalDays) {
		super();
		this.wage_Per_Hour = wage_Per_Hour;
		this.totalHours = totalHours;
		this.totalDays = totalDays;
		this.companyName = companyName;
	}
	
	public void addCompany(String companyName, int wage_Per_Hour, int totalHours, int totalDays) {
		RefactorEmployeeWageUC12 company=new RefactorEmployeeWageUC12(companyName, wage_Per_Hour, totalHours, totalDays);
		/*
		 * method for arraylist
		 */
		companies.add(company);
	}
		
	/*
	 * @param totalWage the totalWage to set
	 */
	public void setTotalWage(int totalWage) {
		this.totalWage = totalWage;
	}
	/*
	 * initializing the method
	 */
	public  void  calculateTotalWage(){
		for(RefactorEmployeeWageUC12 company:companies) {
			int totalWages=calculateTotalWage(company);
			company.setTotalWage(totalWages);
			System.out.println(company);
			
		}
	}
	
	public  int  calculateTotalWage(RefactorEmployeeWageUC12 empCompany) {
		System.out.println("-----------------------------------------------------");
        System.out.println("Total wage of Employee of "+empCompany.companyName+" company");
        System.out.println("-----------------------------------------------------");
        
        for (int day=1,hour=0;hour<=empCompany.totalHours && day<=empCompany.totalDays;day++,hour +=Emp_Day_Hour){
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
   		
   		int wage=Emp_Day_Hour*empCompany.wage_Per_Hour;
   		Wages+=wage;
   		System.out.println("---------------------");
   		System.out.println("Day:"+ day +"\nHours:"+Emp_Day_Hour);
   		System.out.println("--------------------------------------");
   	}
        return Wages;
	}
	/*
	 * to print the output without any changes
	 */
	@Override
	public String toString() {
		System.out.println("Total Working Hours for a Month="+totalHours);
    	System.out.println("Total Working Days for a Month ="+totalDays);
		return "Employe Wages For  Month =" + totalWage ;
	}
}
