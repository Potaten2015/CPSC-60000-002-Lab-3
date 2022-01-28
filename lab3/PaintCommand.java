package lab3;

public class PaintCommand implements Command {
	PaintShop paintShop;
	
	public PaintCommand(PaintShop paintShop) {
		this.paintShop = paintShop;
	}
	
	public void execute() {
		paintShop.paintBody();
		paintShop.paintCap();
	}
	
	public void undo() {
		System.out.println("Can't really unpaint this, so we'll toss the painted parts out I guess.");
	}

}
