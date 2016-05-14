package time.sc.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import net.thucydides.core.pages.PageObject;


public class MenuPage extends PageObject {
    
    @FindBy(xpath="//div[@class='toolbar__label' and .='Settings and Profile']")
    private WebElementFacade settings;

    
    public void enter_settings(String keyword) {
        settings.click();
    }
}

