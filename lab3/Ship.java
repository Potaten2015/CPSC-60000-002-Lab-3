package lab3;

public abstract class Ship {

	public void loadTrucks() {
		System.out.println("Loading Trucks...");
	};
	public abstract void getOnTheRoad();
	public abstract void estimateArrival();
	public void processReturn() {
		System.out.println("Returning sunblock to factory...Must have been defective or something.");
	};
	
}
