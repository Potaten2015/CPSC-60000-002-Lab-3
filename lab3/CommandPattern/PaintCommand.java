package lab3.CommandPattern;

public class PaintCommand implements Command {
	PaintShop paintShop;
	
	public PaintCommand(PaintShop paintShop) {
		this.paintShop = paintShop;
	}
	
	public int execute() {
		paintShop.paintBody();
		paintShop.paintCap();
		return 1;
	}
	
	public void undo() {
		System.out.println("Can't really unpaint this, so we'll toss the painted parts out I guess.");
	}

}
