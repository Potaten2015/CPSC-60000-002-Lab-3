package lab3;

public class Pink50SunblockMixer extends SunblockMixer {

	String color = "pink";
	String spf = "50";
	
	@Override
	public void addIngredients() {
		System.out.println("Adding " + color + " dye...");
		System.out.println("Adding spf " + spf + " sunblock...");
	}

	@Override
	public void mix() {
		System.out.println("Mixing ingredients...");
	}

}
