package lab3;

import FacadePattern.SunblockProcess;
import FacadePattern.SunblockProcessFacade;
import lab3.CommandPattern.AssemblyController;
import lab3.CommandPattern.BigMold;
import lab3.CommandPattern.BlueGreenPaintShop;
import lab3.CommandPattern.Command;
import lab3.CommandPattern.FastTubeFiller;
import lab3.CommandPattern.FillTubeCommand;
import lab3.CommandPattern.MacroCommand;
import lab3.CommandPattern.MixCommand;
import lab3.CommandPattern.MoldCommand;
import lab3.CommandPattern.OneDayShip;
import lab3.CommandPattern.PaintCommand;
import lab3.CommandPattern.Pink50SunblockMixer;
import lab3.CommandPattern.ShipCommand;

// No return values for the Command Pattern, as we aren't expecting results outside of the command being performed.

public class Lab3Run {

	public static void main(String[] args) {
		
		//
		// Command pattern
		//
		
		AssemblyController controller = new AssemblyController();
		Command mold = new MoldCommand(new BigMold());
		Command paint = new PaintCommand(new BlueGreenPaintShop());
		Command mix = new MixCommand(new Pink50SunblockMixer());
		Command fill = new FillTubeCommand(new FastTubeFiller());
		Command ship = new ShipCommand(new OneDayShip());
		controller.setCommand(0, mold);
		controller.setCommand(1, paint);
		controller.setCommand(2, mix);
		controller.setCommand(3, fill);
		controller.setCommand(4, ship);
		
		for(int i = 0; i < 10; i++) {
			controller.startButtonPushed(i);
		}
		
		for(int i = 0; i < 10; i++) {
			controller.cancelButtonPushed(i);
		}
		
		// Testing the implementation commands
		Command[] commands = {mix, fill};
		
		controller.setCommand(9, new MacroCommand(commands));
		
		controller.startButtonPushed(9);
		controller.cancelButtonPushed(9);
		
		//
		// Facade pattern (takes advantage of some of the previously built classes)
		//
		SunblockProcess normalProcess = new SunblockProcess(mold, paint, mix, fill, ship);
		SunblockProcessFacade easyProcess = new SunblockProcessFacade(mold, paint, mix, fill, ship);
		
		// Now to complete a full process, we go from this:
		normalProcess.mold();
		normalProcess.paint();
		normalProcess.mix();
		normalProcess.fill();
		normalProcess.ship();
		
		// To this:
		easyProcess.produceSunblock();
		
	}

}
