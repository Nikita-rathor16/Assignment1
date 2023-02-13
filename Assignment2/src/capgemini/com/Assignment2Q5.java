package capgemini.com;

abstract class Shape5 {
	abstract public String draw();
}

class Rectangle5 extends Shape5 {
	@Override
	public String draw() {
		return "I am drawing Rectangle";
	}
}

class Line5 extends Shape5 {
	@Override
	public String draw() {
		return "I am drawing Line";
	}
}

class Cube5 extends Shape5 {
	@Override
	public String draw() {
		return "I am drawing Cube";
	}
}

public class Assignment2Q5 {
	public static void main(String[] args) {
		Rectangle5 r = new Rectangle5();
		System.out.println(r.draw());

		Line5 l = new Line5();
		System.out.println(l.draw());

		Cube5 c = new Cube5();
		System.out.println(c.draw());

	}
}
