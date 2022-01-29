package lab3.CommandPattern;

public class MoldCommand implements Command {
	Mold mold;
	
	public MoldCommand (Mold mold) {
		this.mold = mold;
	}
	
	public int execute() {
		mold.melt();
		mold.moldBody();
		mold.moldCap();
		mold.set();
		return 1;
	}
	
	public void undo() {
		mold.melt();
	}
	
}
