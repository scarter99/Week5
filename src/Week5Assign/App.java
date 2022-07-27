package Week5Assign;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AsteriskLogger asteriskLog = new AsteriskLogger();
		asteriskLog.Log("Hello");
		asteriskLog.Error("Hello");
		
		SpacedLogger spaceLog = new SpacedLogger();
		spaceLog.Log("Goodbye");
		spaceLog.Error("Goodbye");

	}

}
