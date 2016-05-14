package time.sc.features.uitests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import time.sc.steps.serenity.EndUserSteps;

@RunWith(SerenityRunner.class)
public class EditUserProfileTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EndUserSteps user;

    @Before
	public void maxwin() {
    	user.open_signin_page();
        user.enter_email("igor.lukashow@gmail.com");
        user.enter_password("zp130k");
        user.signin();
		webdriver.manage().window().maximize();		
	}
    
    @Test
    public void edit_lastname() {
        user.open_profile_edit_page();
        user.type_lastname("Ivanov");
        user.save();
        user.assert_that_alert_is_visible();
    }
    
    @Test
    public void edit_city() {
        user.open_profile_edit_page();
        user.type_city("Minsk");
        user.save();
        user.assert_that_alert_is_visible();
    }
    

} 