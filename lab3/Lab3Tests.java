package lab3;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Lab3Tests {
	
	// No tests for the controller and associated commands. Expected behavior is visible in console.
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
	
	
	
	@BeforeEach
	public void setUp() {
	    System.setOut(new PrintStream(outputStreamCaptor));
	}

	@Test
	void testMoldCommand() {
	    AssemblyController controller = new AssemblyController();
	    controller.setCommand(0, new MoldCommand(new BigMold()));
		Assert.assertEquals("Melting all the plastic...\n"
				+ "Pouring plastic into big body mold...\n"
				+ "Pouring plastic into big cap mold...\n"
				+ "Letting plastic set...", outputStreamCaptor.toString()
			      .trim());
	}

}
