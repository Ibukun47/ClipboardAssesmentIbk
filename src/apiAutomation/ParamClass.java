package apiAutomation;
import org.testng.annotations.DataProvider;

public class ParamClass {
	
	@DataProvider(name="UserDetails")
	public Object[][] userdatapost(){

		return new Object[][] {
			{"admin", "admin"},
			{"ronaldo", "player"}
		};
	}
	
	@DataProvider(name="POJOUserDetails")
	public Object[][] POJOUserDetails(){

		return new Object[][] {
			{"admin", "admin"},
			{"ronaldo", "player"}
		};
	
	}
}


