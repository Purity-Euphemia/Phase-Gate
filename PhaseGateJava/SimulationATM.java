import java.util.Scanner;
public class SimulationATM{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("WELCOME TO YOUR ATM");

	System.out.println("LIST OF MENU FUNTIONS");


String MENU = """
	1. Create account.
	2. Deposit money.
	3. Withdraw money.
	4. Close account.
	5. Exist.
	
	""";
	System.out.println(MENU);
	int menu = input.nextInt();

	
	switch (menu) {
	case 1: System.out.println("Create account"); 
		while (true) {
		System.out.print("Enter new account number(up to 10 digits): ");
		int account_number = input.nextInt();
		if (account_number != 10)  {
			System.out.print("Invalid account number! Must be digits only and max 10 digits");
}
		else if (account_number == accounts){
			System.out.print("Account number already exists! Try another.");
}
		else {
			accounts[account_number] = 0;
			System.out.println("Account " +  account_number  +  "created Your current balance $0");
} 
}

break;

	case 2: System.out.println("Deposit money.");
		function deposit(){
	System.out.print("Enter account number to deposit money: ");
	int account_number = input.nextInt();
	if (account_number == accounts) {
		let amount = float(input("Enter amount to deposit: "));
}
		if (amount > 0) {
			accounts[account_number] += amount
			System.out.println("amount" +  deposited account + "account_number". +  New balance: +  "accounts[account_number");
}
		else {
			System.out.print("Please enter a positive amount: ");
}
	else {
		System.out.print("Account number not found");
}

}


 break;

	case 3: System.out.println("Withdraw money."); 

		funtion withdraw() {
	System.out.print("Enter account number to withdraw money: ");
	int account_number = input.nextInt();
	if (account_number == accounts) {
		if (accounts(account_number) <= 0) {
			System.out.print("Your account has no money left to withdraw");

}
			return
		let amount = float(input("Enter withdrawal amount multiples of #500 or #1000: "));
		if (amount < 500) {
			System.out.print("invalid amount! Withdrawals must be in multiples of #500 or #1000");
}
		else if (amount < 90) {
			System.out.print("whithdrawal failed! You cannot withdraw more than 90% of your balance");
}
		else {	
			accounts[account_number] -= amount + 100
			System.out.print("transaction successful");
			System.out.println("amount" + withdraw from account + "account_number". +  Remaining balance: +  "accounts[account_number");

}
	else:
		System.out.print("Account number not found");

}
}


break;

	case 4: System.out.println("Close account.");

		function close_account() {
	System.out.print("Enter account number to close: ");
	int account_number = input.nextInt();
	if (account_number == accounts) {
		confirm = prompt(f"Are you sure you want to close: ");
		if (confirm == yes) {
			del accounts[account_number]
			System.out.println(Account + "account_number" +  closed successfully");
}

}
		else {
			System.out.print("Account closure canceled");

}
	else {
		System.out.print("Account number not found");


}

}


 break;

	case 5: System.out.println("Exist."); break;
