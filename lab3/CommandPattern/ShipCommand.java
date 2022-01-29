package lab3.CommandPattern;

public class ShipCommand implements Command {

	public Ship shipper;
	
	public ShipCommand(Ship shipper) {
		this.shipper = shipper;
	}
	
	@Override
	public int execute() {
		shipper.loadTrucks();
		shipper.getOnTheRoad();
		shipper.estimateArrival();
		return 1;
	}

	@Override
	public void undo() {
		shipper.processReturn();
	}

}
