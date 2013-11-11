package Atsushi.Iwana.kbc.kj;

public abstract class Decorator implements Cake {

	protected Cake cake;

	public Decorator(Cake cake) {
		this.cake = cake;
	}

	public void display() {

	}

}
