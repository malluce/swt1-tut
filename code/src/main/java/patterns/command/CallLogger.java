package patterns.command;

import java.util.ArrayList;
import java.util.List;

public class CallLogger {
	private List<Command> history = new ArrayList<Command>();

	public void executeAndLog(Command c) {
		System.out.println("executing " + c.getClass().getSimpleName());
		history.add(c);
		c.execute();
	}

	public Command[] getAllExecutedCommands() {
		if (history.isEmpty()) {
			return null;
		} else {
			return history.toArray(new Command[0]);
		}
	}
}
