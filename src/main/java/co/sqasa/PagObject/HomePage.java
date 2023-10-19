package co.sqasa.PagObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://sanangel.com.co/")
public class HomePage extends PageObject {

    @FindBy(xpath = "(//h2)[1]")
    WebElementFacade producto1;

    @FindBy(xpath = "(//h2)[2]")
    WebElementFacade producto2;

    public void clickProduct() {
        producto1.click();
    }

    public void clickProduct2() {
        producto2.click();
    }





}
