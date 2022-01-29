package lab3;

public class BigMold extends Mold {

	@Override
	public void melt() {
		System.out.println("Melting all the plastic...");
	}

	@Override
	public void moldCap() {
		System.out.println("Pouring plastic into big cap mold...");
	}

	@Override
	public void moldBody() {
		System.out.println("Pouring plastic into big body mold...");
	}

	@Override
	public void set() {
		System.out.println("Letting plastic set...");
	}

	
	
}
