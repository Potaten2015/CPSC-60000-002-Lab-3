package FacadePattern;

import lab3.CommandPattern.Command;

public class SunblockProcessFacade {
	
	Command mold;
	Command paint;
	Command mix;
	Command fill;
	Command ship;
	
	public SunblockProcessFacade(Command mold, Command paint, Command mix, Command fill, Command ship) {
		
		this.mold = mold;
		this.paint = paint;
		this.mix = mix;
		this.fill = fill;
		this.ship = ship;
		
	}
	
	public void produceSunblock() {
		mold.execute();
		paint.execute();
		mix.execute();
		fill.execute();
		ship.execute();
	}
	
}
