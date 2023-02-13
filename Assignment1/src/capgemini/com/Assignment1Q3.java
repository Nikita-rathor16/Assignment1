package capgemini.com;

class SiCi {

	public double simpleInterest(double principalAmount, int time, double interestRate) {

		double SI = (principalAmount * interestRate * time) / 100;
		return SI;

	}

	public double compoundInterest(double principalAmount, int time, double interestRate) {
		double CI = principalAmount * (Math.pow((1 + interestRate / 100), time)) - principalAmount;
		return CI;
	}
}

public class Assignment1Q3 {
	public static void main(String args[]) {
		SiCi si = new SiCi();

		System.out.println("Simple Intereset is " + si.simpleInterest(1000.12, 5, 12.5));
		System.out.println("Compound Intereset is " + si.compoundInterest(1000.12, 5, 12.5));
	}
}
