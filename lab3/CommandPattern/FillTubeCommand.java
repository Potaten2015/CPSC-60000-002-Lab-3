package lab3.CommandPattern;

public class FillTubeCommand implements Command {

	TubeFiller filler;
	
	public FillTubeCommand(TubeFiller filler) {
		this.filler = filler;
	}
	
	@Override
	public int execute() {
		filler.fillTube();
		filler.capTube();
		return 1;
	}

	@Override
	public void undo() {
		filler.emptyTube();
	}

}
