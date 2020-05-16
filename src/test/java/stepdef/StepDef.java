package stepdef;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jiemworkshop.helper.GlobalMap;
import jiemworkshop.helper.RandomUtils;
import jiemworkshop.module.App;
import jiemworkshop.module.HomePageModule;
import jiemworkshop.module.RegistrationModule;
import jiemworkshop.module.SignOnModule;

public class StepDef {
	
	@Before
	public void setup() throws Throwable {
		open_application();
	}
	
	@After
	public void teardown() throws Throwable {
		close_Application();
	}
	
	
	@Given("^open application$")
	public void open_application() throws Throwable {
		App.openAut();
	}

	@When("^application open successfully$")
	public void application_open_successfully() throws Throwable {
	   
	}
	
	@When("^fill form and register$")
	public void fill_form_and_register(DataTable arg1) throws Throwable {
	    List<Map<String,String>> ls = arg1.asMaps(String.class, String.class);
	    for( Map<String,String> userInfo : ls) {
	    	boolean registrationStatus = RegistrationModule.register
	    			(userInfo.get("FirstName"),
	    			userInfo.get("LastName"), userInfo.get("Phone"), userInfo.get("Email"), 
	    					userInfo.get("Address1"), userInfo.get("City"), userInfo.get("State"), userInfo.get("PostalCode"), 
	    					userInfo.get("Country"),
	    					userInfo.get("password"));
	    	GlobalMap.put("RegistrationStatus", String.valueOf(registrationStatus));
	    }
	    assertTrue(Boolean.parseBoolean(GlobalMap.getValue("RegistrationStatus")));
	    user_click_on_link_in_upper_menu("REGISTER");
	}

	@Then("^validate title as \"([^\"]*)\"$")
	public void validate_title_as1(String arg1) throws Throwable {
		validate_title_as(arg1);
	}

	@Then("^validate Successful registration$")
	public void validate_Successful_registration() throws Throwable {
		assertTrue(Boolean.parseBoolean(GlobalMap.getValue("RegistrationStatus")));
	}
	
	@Then("^validate title as ([^\"]*)$")
	public void validate_title_as(String arg1) throws Throwable {
		assertEquals(arg1,HomePageModule.getTitle());
	}

	@And("^Close Application$")
	public void close_Application() throws Throwable {
		App.closeAut();
	}
	@When("^xyz$")
	public void xyz() throws Throwable {
	    
	}
	
	@When("^user click on ([^\"]*) link in upper menu$")
	public void user_click_on_link_in_upper_menu(String arg1) throws Throwable {
	    HomePageModule.clickUpperMenu(arg1);
	}
	
	@When("^user click on \"([^\"]*)\" link in upper menu$")
	public void user_click_on_link_in_upper_menu1(String arg1) throws Throwable {
		user_click_on_link_in_upper_menu(arg1);
	}
}
