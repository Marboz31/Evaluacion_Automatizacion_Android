package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.cucumber.messages.Messages;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        return productsList.size();
    }

    public void clickBackpack() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        btnBackpack.click();
    }
    public void clickAddToCart() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        btnAddToCart.click();
    }
    public void clickCart() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        btnCart.click();
    }
    public void clickBoltTShirt(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        btnBoltTShirt.click();
    }
    public void clickBikeLight(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        btnBikeLight.click();
    }
    public String getTitle() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        return txtTitle.getText();
    }


}
