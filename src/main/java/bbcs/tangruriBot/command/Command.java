package bbcs.tangruriBot.command;

import java.util.List;

public interface Command {
	void setParameters(List<String> parameters);
	List<String> getParameters();
	boolean execute();
}
