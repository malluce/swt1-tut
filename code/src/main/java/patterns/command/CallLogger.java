package patterns.command;

import java.util.Stack;

public class CallLogger {
	private Stack<Command> history = new Stack<Command>();

	public void executeAndLog(Command c) {
		System.out.println("executing " + c.getClass().getSimpleName());
		history.push(c);
		c.execute();
	}
}
