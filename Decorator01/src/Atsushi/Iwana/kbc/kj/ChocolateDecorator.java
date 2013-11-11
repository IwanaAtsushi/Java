package Atsushi.Iwana.kbc.kj;

public class ChocolateDecorator extends Decorator {
	public ChocolateDecorator(Cake cake) {
		super(cake);
	}

	public void display() {
		System.out.println("チョコレートつき");
		cake.display();
	}

}
