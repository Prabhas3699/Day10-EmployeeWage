package Bridgelabz;

public class TotalWageOfEachCompany {
	 public static void main(String[] args) {
		 /*
		  * creating object and calling method from RefactorEmployeeWageUC9
		  */
		 RefactorEmployeeWageUC9 google=new RefactorEmployeeWageUC9("Google", 8, 100, 20);
		 google.calculateTotalWage();
		 
		 
		 RefactorEmployeeWageUC9 amazon=new RefactorEmployeeWageUC9("Amazon", 10, 200, 30);
		 amazon.calculateTotalWage();
	 }
}
