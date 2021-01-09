
public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		String newLog = log.replace("", " ").trim();
		System.out.println(newLog);

	}

	@Override
	public void error(String error) {
		String newError = error.replace("", " ").trim();
		System.out.println("ERROR: " + newError);

	}

}
