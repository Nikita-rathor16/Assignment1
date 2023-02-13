package capgemini.com;

import java.util.Scanner;

class ResultDeclaration {
	public String declareResults(double subject1Marks, double subject2Marks, double subject3Marks) {
		String res = "";
		if ((subject1Marks > 60 || subject2Marks > 60 || subject3Marks > 60)) {
			if (subject1Marks + subject2Marks < 60 || subject2Marks + subject3Marks < 60
					|| subject3Marks + subject1Marks < 60) {
				res = "Failed";
				return res;
			}
		}
		if (subject1Marks + subject2Marks > 60 || subject2Marks + subject3Marks > 60
				|| subject3Marks + subject1Marks > 60) {
			res = ("passed" + " " + "Promoted");
			return res;
		}
		if (subject1Marks + subject2Marks + subject3Marks > 60) {
			res = "passed";
			return res;
		}
		res = "Failed";
		return res;

	}
}

public class Assignment1Q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter test case:");
		int t = sc.nextInt();

		while (t != 0) {
			System.out.println("Enter a:");
			double a = sc.nextDouble();
			System.out.println("Enter b:");
			double b = sc.nextDouble();
			System.out.println("Enter c:");

			double c = sc.nextDouble();

			ResultDeclaration obj = new ResultDeclaration();

			System.out.println(obj.declareResults(a, b, c));

			t--;

		}
	}
}
