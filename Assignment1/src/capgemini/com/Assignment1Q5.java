package capgemini.com;

import java.util.Scanner;

class TaxAmount {
	public double calculateTaxAmount(int ctc) {
		double ans = 0;
		if (ctc >= 0 && ctc <= 180000) {
			ans = 0;
		} else if (ctc >= 181001 && ctc <= 300000) {
			ans = ctc * (0.1);
		} else if (ctc >= 300001 && ctc <= 500000) {
			ans = ctc * (0.2);
		} else if (ctc >= 500001 && ctc <= 1000000) {
			ans = ctc * (0.3);
		}
		return ans;

	}
}

public class Assignment1Q5 {
	public static void main(String args[]) {
		TaxAmount P = new TaxAmount();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		int ctc = sc.nextInt();
		System.out.println("Tax amount :");
		System.out.println(P.calculateTaxAmount(ctc));

	}
}
