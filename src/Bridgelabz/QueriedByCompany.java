package Bridgelabz;

public class QueriedByCompany {

	public static void main(String[] args) {
		/*
		 * creating object and calling method from RefactorEmployeeWageUC14
		 */
		RefactorEmployeeWageUC14 company =new RefactorEmployeeWageUC14();
		company.addCompany("Google", 8, 100, 20);
		company.addCompany("Amazon", 10, 150, 30);
		company.calculateTotalWage();
		company.dailyWage();
		company.getDailyWages("Google");
	}

}
