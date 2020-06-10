public class EmployeeWageUC{ public static void main(String[] args){
		int ratePerHour=20,empHour=0,TotalHours=0,TotalDays=0;
		System.out.println("Welcome to Employee Wage Computation.");
		int fulltime=1;
		int parttime=2;
		int WorkingDays=20;
		int MaxHours=100;
		while(TotalHours<MaxHours && TotalDays<WorkingDays){
		TotalDays++;
		double empCheck=Math.floor(Math.random()*10)%3;
		switch((int) empCheck) {
		case 1: empHour=8;
				break;
		case 2: empHour=4;
				break;
		default:empHour=0;
				}
	
		System.out.println("Dailywage="+(ratePerHour*empHour));
		TotalHours+=empHour;
		}
		System.out.println("Total salary is="+(ratePerHour*TotalHours));
	}
}
