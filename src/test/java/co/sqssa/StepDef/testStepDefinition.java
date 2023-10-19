package co.sqssa.StepDef;

import co.sqasa.Steps.HomeSteps;
import co.sqasa.Steps.ProductSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class testStepDefinition {

    @Steps
    HomeSteps homeSteps;

    @Steps
    ProductSteps productSteps;


    @Given("^que estoy en la pagina home de san angel$")
    public void queEstoyEnLaPaginaHomeDeSanAngel() {
        homeSteps.openPage();
    }


    @When("^agrego el primer producto con sus detalles \"([^\"]*)\"$")
    public void agregoElPrimerProductoConSusDetalles(String units) {
        homeSteps.clickProduct();
        productSteps.clickDate();
        productSteps.clickHour();
        productSteps.enterUnits(units);
        productSteps.clickAddToCart();
    }

    @When("^vuelvo a la pagina Home de san angel$")
    public void vuelvoALaPaginaHomeDeSanAngel() {
        productSteps.clickLogo();
    }

    @When("^agrego el segundo producto con sus detalles \"([^\"]*)\"$")
    public void agregoElSegundoProductoConSusDetalles(String units) {
        homeSteps.clickProduct2();
        productSteps.clickDate();
        productSteps.clickHour();
        productSteps.enterUnits(units);
        productSteps.clickAddToCart();
    }


    @Then("^deberia ver los productos en el carrito$")
    public void deberiaVerLosProductosEnElCarrito() {

    }
}
