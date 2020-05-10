package jiemworkshop;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import jiemworkshop.helper.RandomUtils;
import jiemworkshop.module.RegistrationModule;
import jiemworkshop.module.SignOnModule;
import jiemworkshop.pages.SignOnPage;

public class SanityTest  extends BaseTestCase{
	
	@Test
	public void btest_sanity_test() {
		
		boolean registrationStatus = RegistrationModule.register
		("fname", "lname", "7483747382", "test"+RandomUtils.getRandomNumber(100, 5000)+"@gmail.com", 
				"address1", "Pune", "Maha", "411027", "INDIA",
				"test");
		assertTrue(registrationStatus);
		SignOnModule.login();
	}
	
	
	
}
