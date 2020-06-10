public class EmployeeWageUC{
	public static void main(String[] args){
		int ratePerHour=20,empHour=0;
		System.out.println("Welcome to Employee Wage Computation.");
		int fulltime=1;
		int parttime=2;
		double empCheck=Math.floor(Math.random()*10)%3;
		switch((int) empCheck) {
		case 1: empHour=8;
				break;
		case 2: empHour=4;
				break;
		default:empHour=0;
				}
	
		System.out.println("Dailywage="+ratePerHour*empHour);

	}
}
