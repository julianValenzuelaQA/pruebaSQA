package co.sqasa.Steps;

import co.sqasa.PagObject.ProductPage;
import net.thucydides.core.annotations.Step;

public class ProductSteps {

    ProductPage productPage;

    @Step
    public void clickDate() {
        productPage.clickDate();
    }

    @Step
    public void clickHour() {
        productPage.clickHour();
    }

    @Step
    public void enterUnits(String units) {
        productPage.enterQuantity(units);
    }

    @Step
    public void clickLogo() {
        productPage.clickLogo();
    }

    @Step
    public void clickAddToCart() {
        productPage.clickAddToCart();
    }



}
