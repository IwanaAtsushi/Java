package Atsushi.Iwana.kbc.kj;

public class StrawberryDecorator extends Decorator {

	public StrawberryDecorator(Cake cake) {
		super(cake);
	}

	public void display() {
		System.out.println("苺つき");
		cake.display();
	}

}
