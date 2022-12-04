
public class Loan {
	private double aRate; 
	private double duration; 
	private double loanAmount;
	private java.util.Date loanDate; 
	
	//create class and no-arg construction
	public Loan() {
		this(2.5,1, 1000);
		
	}
	
	public Loan(double aRate, double duration, double loanAmount) {
		this.aRate = aRate;
		this.duration = duration; 
		this.loanAmount +=loanAmount; 
		
	}
	
	public double getAnnualInterestRate () { 
		return aRate; 
	}
	public void setAnnualInterestRate(double aRate) { 
		this.aRate = aRate; 
	}
	
	public double getDuration() { 
		return duration; 
	}
	
	public void setDuration(double duration) { 
		this.duration = duration; 
	}
	public double getLoanAmount() { 
		return loanAmount; 
	}
	public double setLoanAmount() { 
		this.loanAmount = loanAmount;
	}
	public double getMonthlyPayment() { 
		double monthlyInterestRate = aRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1-(1/ Math.pow(1+ monthlyInterestRate, duration *12))) ;
		return monthlyPayment;
    }
	public double getTotalPayment() { 
		double totalPayment = getMonthlyPayment() * duration* 12;
		return totalPayment;
	}
	public java.util.Date getLoanDate() { 
		return loanDate; 
	}
	
	
	
}
