package capgemini.com;

class SingletonInheritanceCheck {

	private static SingletonInheritanceCheck single_instance = null;
	public String s;

	private SingletonInheritanceCheck() {
		s = "Hello I'm singleton class Constructor";
	}

	public static SingletonInheritanceCheck getSingle_instance() {

		if (single_instance == null)
			single_instance = new SingletonInheritanceCheck();

		return single_instance;
	}

}

public class Assignment2Q1 {
	public static void main(String args[]) {

		SingletonInheritanceCheck x = SingletonInheritanceCheck.getSingle_instance();

		SingletonInheritanceCheck y = SingletonInheritanceCheck.getSingle_instance();

		System.out.println("Hashcode of x is " + x.hashCode());
		System.out.println("Hashcode of y is " + y.hashCode());

		if (x == y) {

			System.out
					.println("Two objects point to the same memory location on the heap i.e" + ", to the same object");
		}

		else {

			System.out.println("Two objects DO NOT point to the same memory location on the heap");
		}
	}
}
