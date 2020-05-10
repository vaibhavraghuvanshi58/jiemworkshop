package jiemworkshop;

import org.junit.After;
import org.junit.Before;

import jiemworkshop.module.App;

public class BaseTestCase {
	@Before
	public void setup() {
		App.openAut();
	}
	
	@After
	public void teardown() {
		App.closeAut();
	}
}
