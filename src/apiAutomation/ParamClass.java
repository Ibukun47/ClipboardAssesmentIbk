package apiAutomation;
import org.testng.annotations.DataProvider;

public class ParamClass {
	
	@DataProvider(name="UserDetails")
	public Object[][] userdatapost(){

		return new Object[][] {
			{"Ibukun", "Admin"},
			{"Mag", "Senior Analyst"}
		};
	}
	
	@DataProvider(name="POJOUserDetails")
	public Object[][] POJOUserDetails(){

		return new Object[][] {
			{"Ibukun", "Admin"},
			{"Mag", "Senior Analyst"}
		};
	
	}
}


