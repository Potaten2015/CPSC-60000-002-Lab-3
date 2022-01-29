package lab3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lab3.CommandPattern.AssemblyController;
import lab3.CommandPattern.BigMold;
import lab3.CommandPattern.BlueGreenPaintShop;
import lab3.CommandPattern.Command;
import lab3.CommandPattern.FastTubeFiller;
import lab3.CommandPattern.FillTubeCommand;
import lab3.CommandPattern.MixCommand;
import lab3.CommandPattern.MoldCommand;
import lab3.CommandPattern.OneDayShip;
import lab3.CommandPattern.PaintCommand;
import lab3.CommandPattern.Pink50SunblockMixer;
import lab3.CommandPattern.ShipCommand;

class Lab3Tests {

	// Chose to check status code on build commands
	AssemblyController controller = new AssemblyController();
	Command mold = new MoldCommand(new BigMold());
	Command paint = new PaintCommand(new BlueGreenPaintShop());
	Command mix = new MixCommand(new Pink50SunblockMixer());
	Command fill = new FillTubeCommand(new FastTubeFiller());
	Command ship = new ShipCommand(new OneDayShip());
	
	
	@Test
	void moldTest() {
		controller.setCommand(0, mold);
		assertEquals(1, mold.execute());
		assertNotEquals(0, controller.startButtonPushed(0));
	}
	
	@Test
	void paintTest() {
		controller.setCommand(1, paint);
		assertEquals(1, paint.execute());
		assertEquals(1, controller.startButtonPushed(1));
	}
	
	@Test
	void mixTest() {
		controller.setCommand(2, mix);
		assertEquals(1, mix.execute());
		assertEquals(1, controller.startButtonPushed(2));
	}
	
	@Test
	void fillTest() {
		controller.setCommand(3, fill);
		assertEquals(1, fill.execute());
		assertEquals(1, controller.startButtonPushed(3));
	}
	
	@Test
	void shipTest() {
		controller.setCommand(4, ship);
		assertEquals(1, ship.execute());
		assertEquals(1, controller.startButtonPushed(4));
	}
}
