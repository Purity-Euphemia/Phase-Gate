import java.util.Scanner;
public class WelcomeToSemicolon{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	String name = " ";
	int hour = 0;
	double pay = 0;
	int rate1 = 0;
	int rate2 = 0;



	System.out.println("WELCOME TO EMPLOYEES PAYROLL");

	System.out.println("LIST OF MENU FUNTIONS");

	String MENU = """
	1. Add Employee payroll.
	2. View Employees payroll.
	3. Update Employees payroll.
	4. Exits.
	
	""";
	System.out.println(MENU);
	while (true) {
	System.out.println("Enter (1-4) for menu: ");
	int number = input.nextInt();
	

	switch (number) {
	case 1: System.out.println("Add Employee payroll."); 

		System.out.print("Enter Employee name: ");
		name = input.next();

		System.out.print("Enter number of hours worked in a week: ");
		hour = input.nextInt();

		System.out.print("Enter hourly pay rate: ");
		pay = input.nextDouble();
		int Gross = hour * pay
		System.out.print("Enter federal tax withholding rate: ");
		rate1 = input.nextInt();

		System.out.print("Enter state tax withholding rate: ");
		rate2 = input.nextInt();
		
		System.out.println("Employee payroll add ==========>");


	
	case 2: System.out.println("View Employees payroll"); 

		if ()
		
	case 3: System.out.println("Update Employees payroll.");
		
		for(int count = 0; count > 3; count++){
			if (number != 3){
			System.out.print("No employee details added");
}
			System.out.printf("{count}. {list['name'], ['hour'], ['pay'], ['rate1'], ['rate2']}\n"
		return result



	case 4: System.out.println("Exist."); break;
} 






}

}

}