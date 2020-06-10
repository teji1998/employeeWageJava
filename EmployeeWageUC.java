public class EmployeeWageUC{
	public static void main(String[] args){
		int ratePerHour=20,empHour=0;
		System.out.println("Welcome to Employee Wage Computation.");
		int fulltime=1;
		double empCheck=Math.floor(Math.random()*10)%2;
		if (empCheck==fulltime){
			empHour=8;
		}
		else
			empHour=0;
		System.out.println("Dailywage="+ratePerHour*empHour);

	}
}
