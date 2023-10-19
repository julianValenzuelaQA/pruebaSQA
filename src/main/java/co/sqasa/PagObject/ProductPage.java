package co.sqasa.PagObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageObject {

    @FindBy(xpath = "(//*[@class='item-button'])[2]")
    WebElementFacade date;

    @FindBy(xpath = "(//*[@class='hour-dropdow-item '])[2]")
    WebElementFacade hour;

    @FindBy(id = "quantity_6531a179c1ea7")
    WebElementFacade quantity;

    @FindBy(xpath = "//*[@class='navmenu__logo']")
    WebElementFacade logoHref;

    @FindBy(name = "add-to-cart")
    WebElementFacade addToCart;

    public void clickDate() {
        date.click();
    }

    public void clickHour() {
        hour.click();
    }

    public void enterQuantity(String units) {
        quantity.deselectByValue(units);
    }

    public void clickLogo() {
        logoHref.click();
    }

    public void clickAddToCart() {
        addToCart.click();
    }


}
