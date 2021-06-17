package crmMultipleSteps;

import org.testng.annotations.Listeners;

import com.OmistusCrm.generic.FileLib;
import com.OmistusCrm.generic.IAutoConsts;
import com.OmistusCrm.generic.WebDriverCommonLib;
import com.OmistusPages.LoginPage;
@Listeners(com.OmistusCrm.generic.MyListeners.class)


public class ValidLoginTest implements IAutoConsts {
	
	public void loginToApp() throws Throwable {
		LoginPage lp =new LoginPage(null);
		FileLib fl= new FileLib();
		lp.login(fl.readPropData(PROP_PATH, "username"), fl.readPropData(PROP_PATH, "password"));
		WebDriverCommonLib wd =new WebDriverCommonLib();
		wd.verify(wd.getPageTitle(), fl.readPropData(PROP_PATH, "homeTitle"), "Home page");
	}

}