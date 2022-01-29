package lab3;

// No return values for the Command Pattern, as we aren't expecting results outside of the command being performed.

public class Lab3Run {

	public static void main(String[] args) {
		
		AssemblyController controller = new AssemblyController();
		// I'm aware that setting commands this way creates controlled objects that we can't reuse
		// That's okay here. We're just testing the pattern. If we wanted individual modular instances
		// of the objects, we could do that. 
		controller.setCommand(0, new MoldCommand(new BigMold()));
		controller.setCommand(1, new PaintCommand(new BlueGreenPaintShop()));
		controller.setCommand(2, new MixCommand(new Pink50SunblockMixer()));
		controller.setCommand(3, new FillTubeCommand(new FastTubeFiller()));
		controller.setCommand(4, new ShipCommand(new OneDayShip()));
		
		for(int i = 0; i < 10; i++) {
			controller.startButtonPushed(i);
		}
		
		for(int i = 0; i < 10; i++) {
			controller.cancelButtonPushed(i);
		}
		
		// Testing the implementation commands
		Command[] commands = {new MixCommand(new Pink50SunblockMixer()), new FillTubeCommand(new FastTubeFiller())};
		
		controller.setCommand(9, new MacroCommand(commands));
		
		controller.startButtonPushed(9);
		controller.cancelButtonPushed(9);
		
	}

}
