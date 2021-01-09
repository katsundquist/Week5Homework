
public class AsteriskLogger implements Logger{

	@Override
	public void log(String log){
		System.out.println( "***" + log + "***");
	}

	@Override
	public void error(String error) {
		int numberOfAsterisk = error.length() + 13;
		String stringLine = "*".repeat(numberOfAsterisk);
		System.out.println(stringLine);
		System.out.println("***Error: " + error + "***");
		System.out.println(stringLine);
	}

}
