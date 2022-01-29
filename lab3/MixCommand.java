package lab3;

public class MixCommand implements Command {
	
	SunblockMixer mixer;

	public MixCommand(SunblockMixer mixer) {
		this.mixer = mixer;
	}

	@Override
	public void execute() {
		mixer.addIngredients();
		mixer.mix();
	}

	@Override
	public void undo() {
		System.out.println("Tried to unmix ingredients but it was unsuccessful. Flushing batch...");
	};
	
	
	
}
