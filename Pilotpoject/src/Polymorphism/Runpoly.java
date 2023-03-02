package Polymorphism;

public class Runpoly {
	public static void main(String[] args) {
		Flowers o= new Bees();
		o.gen();
	}
}

class Flowers {
	void gen() {
		System.out.println("We gen fragnance");
	}
}
class Bees extends Flowers{
	void gen() {
		System.out.println("We gen honey");
	}
}