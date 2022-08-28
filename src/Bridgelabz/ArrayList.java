package Bridgelabz;

public class ArrayList {
	public static void main(String[] args) {
		/*
		 * creating object and calling method from RefactorEmployeeWageUC12
		 */
		RefactorEmployeeWageUC12 company =new RefactorEmployeeWageUC12();
		company.addCompany("Google", 8, 100, 20);
		company.addCompany("Amazon", 10, 150, 30);
		company.calculateTotalWage();

	}

}
