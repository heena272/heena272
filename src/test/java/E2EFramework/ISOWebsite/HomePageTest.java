package E2EFramework.ISOWebsite;

import java.io.IOException;

import org.testng.annotations.Test;

public class HomePageTest extends Base{
	
	@Test
	public void homePageNavigate() throws IOException{
		
		driver = invokeBrowser();
		driver.get("http://isha.sadhguru.org");
	}

}
