package polymorphismDemo;

public class EmailLogger extends BaseLogger{

	public void Log(String message) {
		System.out.println("Logger to email : " +message);
	}
}
