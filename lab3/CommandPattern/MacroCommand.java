package lab3.CommandPattern;

public class MacroCommand implements Command {

	Command[] commands;
	
	public MacroCommand(Command[] commands) {
		this.commands = commands;
	}
	
	@Override
	public int execute() {
		for(int i = 0; i < commands.length; i++) {
			commands[i].execute();
		}
		return 1;
	}

	@Override
	public void undo() {
		for(int i = commands.length - 1; i >= 0; i--) {
			commands[i].undo();
		}
	}

	
	
}
