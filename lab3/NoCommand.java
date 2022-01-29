package lab3;

public class NoCommand implements Command {
	
	public NoCommand() {}

	@Override
	public void execute() {
		System.out.println("Does nothing...");
	}

	@Override
	public void undo() {
		System.out.println("Does nothing...");
	};
	
	
	
}
