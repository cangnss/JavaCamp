package interfaces;

public class SmsLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Sms gönderildi: "+message);
	}//implemente etmek demek loggerý smsLoggera uyarla demek. gerekli olan kodlarý yaz demek. 
	
}
