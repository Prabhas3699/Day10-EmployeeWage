package Bridgelabz;

public class InterfaceApproachUC11 {

	public static void main(String[] args) {
		/*
		 * creating object and calling method from RefactorEmployeeWageUC11
		 */
		RefactorEmployeeWageUC11 company =new RefactorEmployeeWageUC11(2);
		company.addCompany("Google", 8, 100, 20);
		company.addCompany("Amazon", 10, 150, 30);
		company.calculateTotalWage();

	}

}
