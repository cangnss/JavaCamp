package interfaces;

public class SmsLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Sms g�nderildi: "+message);
	}//implemente etmek demek logger� smsLoggera uyarla demek. gerekli olan kodlar� yaz demek. 
	
}
