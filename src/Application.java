
public class Application {

	public static void main(String[] args) {
		Logger logger = new SpacedLogger();
		
		logger.log("COVID-19");
		logger.error("COVID-19");
		
		Logger logger2 = new AsteriskLogger();
		
		logger2.log("Eat my shorts");
		logger2.error("Eat my shorts");
		
		
		
	}

}
