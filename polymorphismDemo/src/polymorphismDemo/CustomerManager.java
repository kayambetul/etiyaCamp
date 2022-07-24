package polymorphismDemo;

public class CustomerManager {
	
	private BaseLogger baseLogger;
	
	public CustomerManager(BaseLogger baseLogger) {
		super();
		this.baseLogger = baseLogger;
	}

	public void add() {
		System.out.println("Müşteri eklendi");
		this.baseLogger.Log("Loglamayla Eklendi");
	}

}
