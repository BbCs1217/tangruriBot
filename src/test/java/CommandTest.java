import bbcs.tangruriBot.API.pubgAPI.PubgAPI;
import bbcs.tangruriBot.command.Command;
import bbcs.tangruriBot.command.pubg.PubgCommand;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommandTest {
	@Test
	public void executeTest() {
		Command pubgCommand = new PubgCommand(new PubgAPI());
		assertNotNull(pubgCommand);
		assertTrue(pubgCommand.execute());
	}

	@Test
	public void parameterTest() {
		Command pubgCommand = new PubgCommand(new PubgAPI());
		pubgCommand.setParameters(Arrays.asList(new String[]{"a", "b", "c", "d"}));
		List<String> list = pubgCommand.getParameters();
		assertTrue(list.get(0).equals("a"));
		assertTrue(list.get(1).equals("b"));
		assertTrue(list.get(2).equals("c"));
		assertTrue(list.get(3).equals("d"));
	}
}
