package lab3;

public class MoldCommand implements Command {
	Mold mold;
	
	public MoldCommand (Mold mold) {
		this.mold = mold;
	}
	
	public void execute() {
		mold.melt();
		mold.moldBody();
		mold.moldCap();
		mold.set();
	}
	
	public void undo() {
		mold.melt();
	}
	
}
