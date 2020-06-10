public class EmployeeWageUC{
	public static void main(String[] args){
	System.out.println("Welcome to Employee Wage Computation.");
	int fulltime=1;
	double empCheck=Math.floor(Math.random()*10)%2;
	if (empCheck==fulltime){
		System.out.println("Present");
		}
	else
		System.out.println("Absent");

	}
}
