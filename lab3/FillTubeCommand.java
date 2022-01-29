package lab3;

public class FillTubeCommand implements Command {

	TubeFiller filler;
	
	public FillTubeCommand(TubeFiller filler) {
		this.filler = filler;
	}
	
	@Override
	public void execute() {
		filler.fillTube();
		filler.capTube();
	}

	@Override
	public void undo() {
		filler.emptyTube();
	}

}
