package patterns.command;

public class Client {
	public static void main(String[] args) {

		Light livingRoomLight = new Light();

		CallLogger log = new CallLogger();

		Command c = new LightOnCommand(livingRoomLight);

		log.executeAndLog(c);

		c = new LightOffCommand(livingRoomLight);

		for (int i = 0; i < 5; i++) {
			log.executeAndLog(c);
		}

	}

}
