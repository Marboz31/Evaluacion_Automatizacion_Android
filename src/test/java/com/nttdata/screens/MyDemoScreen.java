package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.cucumber.messages.Messages;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class MyDemoScreen extends PageObject {

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@content-desc=\"Displays all products of catalog\"]")
    private List<WebElement> productsList;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    private WebElement btnBackpack;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bolt T-Shirt\"]")
    private WebElement btnBoltTShirt;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bike Light\"]")
    private WebElement btnBikeLight;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    private WebElement btnAddToCart;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Displays number of items in your cart\"]")
    private WebElement btnCart;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/titleTV\"]")
    private WebElement txtTitle;

    public int getCountElement() {

        return productsList.size();
    }

    public void clickBackpack() {btnBackpack.click();}
    public void clickAddToCart() {btnAddToCart.click();}
    public void clickCart() {btnCart.click();}
    public void clickBoltTShirt(){btnBoltTShirt.click();}
    public void clickBikeLight(){btnBikeLight.click();}
    public String getTitle() {return txtTitle.getText();}


}
