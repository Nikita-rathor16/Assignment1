package capgemini.com;

import java.util.Scanner;

class ArmstrongOrNot {
	public boolean armstrongCheck(int num) {
		int Num = num; // 371
		int rem, sum = 0;
		while (Num != 0) {
			rem = Num % 10; // 1
			int ans = rem * rem * rem; // 1*1*1
			sum = sum + ans;
			Num = Num / 10; // 37
		}
		if (sum == num) {
			return true;
		} else {
			return false;
		}

	}
}

public class Assignment1Q1 {
	public static void main(String[] args) {
		ArmstrongOrNot a = new ArmstrongOrNot();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		if (a.armstrongCheck(num)) {
			System.out.println(num + " is armstrong number");
		} else {
			System.out.println(num + " is not armstrong number");

		}

	}
}
