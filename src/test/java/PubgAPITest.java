import bbcs.tangruri.bot.api.pubg.PubgAPI;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PubgAPITest {
	@Test
	public void PubgAPIConnectTest() {
		PubgAPI pubgAPI = new PubgAPI();
		assertNotNull(pubgAPI);

		System.out.println(pubgAPI.callAPI(Arrays.asList(new String[]{"server"})));
	}
}
