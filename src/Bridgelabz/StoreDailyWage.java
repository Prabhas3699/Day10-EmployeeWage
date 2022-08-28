package Bridgelabz;

public class StoreDailyWage {

	public static void main(String[] args) {
		/*
		 * creating object and calling method from RefactorEmployeeWageUC13
		 */
		RefactorEmployeeWageUC13 company =new RefactorEmployeeWageUC13();
		company.addCompany("Google", 8, 100, 20);
		company.addCompany("Amazon", 10, 150, 30);
		company.calculateTotalWage();
		company.dailyWage();
	}

}
