package com.nttdata.stepsdefinitions;

import com.nttdata.steps.MyDemoSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.internal.common.assertion.Assertion;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class MyDemoStepsDef {

    @Steps
    MyDemoSteps myDemoSteps;


    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicacionDeSauceLabs() {
        System.out.println("Estoy en la Aplicacion de SauceLabs");

    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        myDemoSteps.validarCantProduct();
        System.out.println("Cargo correctamente los productos en la galeria");
    }

    @When("agrego {string} del siguiente producto {string}")
    public void agregoDelSiguienteProducto(String unidades, String producto) {

        if (producto.equals("Sauce Labs Backpack")&& unidades.equals("1")) {
            myDemoSteps.compra1();
            myDemoSteps.agregarCarrito();

        }else if (producto.equals("Sauce Labs Bolt T-Shirt")&& unidades.equals("1")) {
            myDemoSteps.compra2();
            myDemoSteps.agregarCarrito();

        }else if (producto.equals("Sauce Labs Bike Light")&& unidades.equals("2")) {
            myDemoSteps.compra3();
            myDemoSteps.agregarCarrito();
        }else {
            System.out.println("Error: producto invalido");
        }

    }

    @Then("valido el carrito de compra actualice correctamente {string}")
    public void validoElCarritoDeCompraActualiceCorrectamenteY(String prod) {
        myDemoSteps.carrito();
        Assert.assertEquals(prod,myDemoSteps.getTitle());


    }



}
