package jiemworkshop;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import jiemworkshop.module.HomePageModule;

public class SmokeTest extends BaseTestCase {
	 
	//@Test
	public void atest_smoke_test() {
		assertEquals("Welcome: Mercury Tours",HomePageModule.getTitle());
	}
}
