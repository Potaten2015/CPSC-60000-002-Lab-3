package lab3.CommandPattern;

public class MixCommand implements Command {
	
	SunblockMixer mixer;

	public MixCommand(SunblockMixer mixer) {
		this.mixer = mixer;
	}

	@Override
	public int execute() {
		mixer.addIngredients();
		mixer.mix();
		return 1;
	}

	@Override
	public void undo() {
		System.out.println("Tried to unmix ingredients but it was unsuccessful. Flushing batch...");
	};
	
	
	
}
