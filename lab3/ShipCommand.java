package lab3;

public class ShipCommand implements Command {

	public Ship shipper;
	
	public ShipCommand(Ship shipper) {
		this.shipper = shipper;
	}
	
	@Override
	public void execute() {
		shipper.loadTrucks();
		shipper.getOnTheRoad();
		shipper.estimateArrival();
	}

	@Override
	public void undo() {
		shipper.processReturn();
	}

}
