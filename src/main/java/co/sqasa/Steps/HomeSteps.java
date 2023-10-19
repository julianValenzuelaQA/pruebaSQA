package co.sqasa.Steps;

import co.sqasa.PagObject.HomePage;
import net.thucydides.core.annotations.Step;

public class HomeSteps {

    HomePage homePage;

    @Step
    public void openPage() {
        homePage.open();
    }

    @Step
    public void clickProduct() {
        homePage.clickProduct();
    }

    @Step
    public void clickProduct2() {
        homePage.clickProduct2();
    }

}
