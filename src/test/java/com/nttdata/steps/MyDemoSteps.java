package com.nttdata.steps;

import com.nttdata.screens.MyDemoScreen;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class MyDemoSteps {


    MyDemoScreen demo;

    public void validarCantProduct(){
        Assert.assertTrue(demo.getCountElement()>0);
    }

    public void compra1(){demo.clickBackpack();}
    public void compra2(){demo.clickBoltTShirt();}
    public void compra3(){demo.clickBikeLight();}
    public void agregarCarrito(){demo.clickAddToCart();}
    public void carrito(){demo.clickCart();}
    public String getTitle(){return demo.getTitle();}

}
