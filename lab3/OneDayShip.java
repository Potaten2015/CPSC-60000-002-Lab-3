package lab3;

public class OneDayShip extends Ship {

	public OneDayShip() {};

	@Override
	public void getOnTheRoad() {
		System.out.println("The trucks are speeding to the delivery location...");
	}

	@Override
	public void estimateArrival() {
		System.out.println("Trucks expected to arrive in 24 hours...");
	}
	
	

}
