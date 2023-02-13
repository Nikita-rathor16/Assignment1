package capgemini.com;

abstract class Parent {
	abstract public String check();
}

class child extends Parent {
	public String check() {
		return "checking........";
	}
}

public class Assignment2Q4 {
	public static void main(String[] args) {
		// Parent s = new Parent();
		child c = new child();
		System.out.println(c.check());

	}
}