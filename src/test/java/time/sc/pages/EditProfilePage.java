package time.sc.pages;

import org.openqa.selenium.Keys;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://time.sc/profile/edit")
public class EditProfilePage extends PageObject {

	@FindBy(name="fakecity")
    private WebElementFacade city;
	
	@FindBy(name="lastname")
    private WebElementFacade lastname;
	
	@FindBy(xpath="//button/span[.='Save']")
    private WebElementFacade saveBtn;
	
	@FindBy(xpath="//span[.='Profile updated']")
    private WebElementFacade alert;
		
	
    public void enter_city(String keyword) {
        city.type(keyword);
        city.sendKeys(Keys.RETURN);
        
    }
    
    public void enter_lastname(String keyword) {
    	lastname.clear();
    	lastname.sendKeys(keyword);
        
    }
    
    public void save () {
        saveBtn.click();
    }
    
    public void should_see_correct_alert () {
        alert.isVisible();
    }
}
