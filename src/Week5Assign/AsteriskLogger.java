package Week5Assign;


public class AsteriskLogger implements Logger {
	
	
	@Override
	public void Log (String log) {
		System.out.println("***" + log + "***");
	}

	@Override
	public void Error (String error) {
		String message = "***Error: " + error + "***";
		
		for(int i = 0; i < message.length(); i++) {
			System.out.print("*");
		}
		
		System.out.println();
		System.out.println(message);
		
		for(int i = 0; i < message.length(); i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	

}
