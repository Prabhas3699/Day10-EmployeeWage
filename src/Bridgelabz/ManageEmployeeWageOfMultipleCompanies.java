package Bridgelabz;

public class ManageEmployeeWageOfMultipleCompanies {

	public static void main(String[] args) {
		/*
		 * creating object and calling method from RefactorEmployeeWageUC10
		 */
		RefactorEmployeeWageUC10 company =new RefactorEmployeeWageUC10(2);
		company.addCompany("Google", 8, 100, 20);
		company.addCompany("Amazon", 10, 150, 30);
		company.calculateTotalWage();
	}

}
