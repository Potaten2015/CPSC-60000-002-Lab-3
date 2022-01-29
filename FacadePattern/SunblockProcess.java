package FacadePattern;

import lab3.CommandPattern.Command;

public class SunblockProcess {
	Command mold;
	Command paint;
	Command mix;
	Command fill;
	Command ship;
	
	public SunblockProcess(Command mold, Command paint, Command mix, Command fill, Command ship) {
		
		this.mold = mold;
		this.paint = paint;
		this.mix = mix;
		this.fill = fill;
		this.ship = ship;
		
	}
	
	public void mold() {
		mold.execute();
	}
	
	public void paint() {
		paint.execute();
	}
	
	public void mix() {
		mix.execute();
	}
	
	public void fill() {
		fill.execute();
	}
	
	public void ship() {
		ship.execute();
	}
}
