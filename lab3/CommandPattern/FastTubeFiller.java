package lab3.CommandPattern;

public class FastTubeFiller extends TubeFiller {
	
	public FastTubeFiller() {};
	
	@Override
	public void fillTube() {
		System.out.println("Filling tube at LIGHTNING speeds...");
	}

	@Override
	public void capTube() {
		System.out.println("SPINNING THE CAP ON LIKE A HURRICANE");
	}
	
}
