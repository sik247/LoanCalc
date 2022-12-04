
import java.util.*; 
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter annual interest");
		double aRate = input.nextDouble();
		System.out.print("How long is the loan?");
		double duration = input.nextDouble();
		
		System.out.print("Enter the amount");
		double loanAmount = input.nextDouble();
		
		Loan loan = new Loan (aRate, duration, loanAmount) ; 
		
		System.out.printf(loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment()); //null pointer exception
		
		
		
	
	}

}
