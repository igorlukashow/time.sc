package time.sc.steps.serenity;

import time.sc.pages.EditProfilePage;
import time.sc.pages.SigninPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps extends ScenarioSteps {

    SigninPage signinPage;
    EditProfilePage editProfilePage;

    @Step
    public void enter_email(String keyword) {
        signinPage.enter_email(keyword);
    }

    @Step
    public void enter_password(String keyword) {
        signinPage.enter_password(keyword);
    }
    
    @Step
    public void signin() {
        signinPage.signin();
    }


    @Step
    public void open_signin_page() {
        signinPage.openAt("https://time.sc/signin");
    }
    
    @Step
    public void open_profile_edit_page() {
        editProfilePage.open();
    }
    
    @Step
    public void type_city(String keyword){
    	editProfilePage.enter_city(keyword);
    }
    
    @Step
    public void type_lastname(String keyword){
    	editProfilePage.enter_lastname(keyword);
    }
    
    @Step
    public void save (){
    	editProfilePage.save();
    }
    
    @Step
    public void assert_that_alert_is_visible () {
    	editProfilePage.should_see_correct_alert();
    }
 }

    