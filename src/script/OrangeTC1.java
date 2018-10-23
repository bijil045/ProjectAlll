package script;

import org.testng.annotations.Test;
import generic.BaseTest;
import generic.Utility;
import generic.WebGeneric;
import page.DashboardPage;
import page.LoginPage;

public class OrangeTC1 extends BaseTest {
	@Test(priority=1,groups= {"smoke"})
	public void testA() {
		//Take the input data from excel file
		String un=Utility.getDataFromXL(DATA_PATH, "OrangeTC1", 1, 0);
		String pw=Utility.getDataFromXL(DATA_PATH, "OrangeTC1", 1, 1);
		String dbURL=Utility.getDataFromXL(DATA_PATH, "OrangeTC1", 1, 2);
		String loginURL=Utility.getDataFromXL(DATA_PATH, "OrangeTC1", 1, 3);

		//Enter valid username and password & click login
		LoginPage login=new LoginPage(driver);
		login.setUsername(un);
		login.setPassword(pw);
		login.clickLogin();
		//verify that Dashboard Page is displayed
		WebGeneric.verifyURL(driver, lngETO, dbURL, "Dashboard");
		//click welcome then click logout
	/*	DashboardPage d=new DashboardPage(driver);
		d.clickWelcome();
		d.clickLogout(lngETO);
		//verify that login page is displayed
		WebGeneric.verifyURL(driver, lngETO, loginURL, "Login");*/
		
		
	}
}















