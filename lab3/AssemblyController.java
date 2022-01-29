package lab3;

public class AssemblyController {
	
	// Note that there is only once command array. 
	// The "undo" command invokes all of the off/reverse/revert methods that the off commands would otherwise invoke.
	// This simplifies the code in this case.
	Command[] commands;
	
	public AssemblyController() {
		commands = new Command[10];
		
		Command noCommand = new NoCommand();
		
		for (int i = 0; i < 10; i++) {
			commands[i] = noCommand;
		}
		
	}
		
	public void setCommand(int button, Command mainCommand) {
		commands[button] = mainCommand;
	}
	
	public void startButtonPushed(int button) {
		commands[button].execute();
	}
	
	public void cancelButtonPushed(int button) {
		commands[button].undo();
	}
	
}
