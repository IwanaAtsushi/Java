package Atsushi.Iwana.kbc.kj;

public class CreamDecorator extends Decorator {

	public CreamDecorator(Cake cake) {
		super(cake);
	}

	public void display() {
		System.out.println("クリームつき");
		cake.display();
	}

}
