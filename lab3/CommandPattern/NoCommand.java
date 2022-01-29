package lab3.CommandPattern;

public class NoCommand implements Command {
	
	public NoCommand() {}

	@Override
	public int execute() {
		System.out.println("Does nothing...");
		return 1;
	}

	@Override
	public void undo() {
		System.out.println("Does nothing...");
	};
	
	
	
}
