package lab3.CommandPattern;

public abstract class TubeFiller {
	
	public abstract void fillTube();
	public abstract void capTube();
	public void emptyTube() {
		System.out.println("Squeezing tubes dry...");
	};

}
