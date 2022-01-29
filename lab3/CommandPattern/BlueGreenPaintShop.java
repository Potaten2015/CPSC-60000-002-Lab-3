package lab3.CommandPattern;

public class BlueGreenPaintShop extends PaintShop {
	String capColor = "blue";
	String bodyColor = "green";

	public BlueGreenPaintShop() {}

	@Override
	public void paintCap() {
		System.out.println("Painting cap " + capColor);
	}

	@Override
	public void paintBody() {
		System.out.println("Painting body " + bodyColor);
	}

}
