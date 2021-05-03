
public class UserManager implements UserService{
	private EdevletManager eDevletLogger;
	
	public UserManager(EdevletManager eDevletLogger) {
		this.eDevletLogger = eDevletLogger;
		}
	
	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
if(eDevletLogger.check(user) == true) {
			
			System.out.println("Kay�t Olundu: " + user.getFirstName());
		}
		else
			System.out.println("L�tfen Ge�erli Kimlik No Giriniz.");
	}

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
if(eDevletLogger.check(user) == true) {
			
			System.out.println("giri� yap�ld: " + user.getFirstName());
		}
		else
			System.out.println("L�tfen Ge�erli Kimlik No Giriniz.");
	}

	@Override
	public void delete(User user) {
if(eDevletLogger.check(user) == true) {
			
			System.out.println("hesab�n�z silindi: " + user.getFirstName());
		}
		else
			System.out.println("L�tfen Gecerli Kimlik No Giriniz.");
	}


}
