package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages_POM_Design.P01_User_Select_3_Product;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class D01_User_Select_Products {
    P01_User_Select_3_Product VodaItem = new P01_User_Select_3_Product();
    SoftAssert Soft = new SoftAssert();
    Actions Act = new Actions(Hooks.driver);


    ///////////////////////FIRST_ITEM////////////////////////
    @Given("user login")
    public void User_Login() throws InterruptedException {
        VodaItem.CookiesAccept().click();
        VodaItem.ClickForLogin().click();
        VodaItem.LoginID().sendKeys("01100423690");
        VodaItem.Password().sendKeys("@Testing123");
        Thread.sleep(2000);
        VodaItem.Submit().click();
        Hooks.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }
    @When("user select deals")
    public void Select_Deals() throws InterruptedException {
        Thread.sleep(2000);
        VodaItem.CategorySearch().click();
        VodaItem.SelectDeals().click();
        Thread.sleep(2000);
    }
    @And("user select item")
    public void Select_item() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Hooks.driver,Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("img[src=\"https://eshop.vodafone.com.eg/ecommerce/api/asset/content/121126890.png?contextRequest=%7B%22forceCatalogForFetch%22:false,%22applicationId%22:%2201H5FECVAV4YWT0NGQKXEN1T51%22,%22tenantId%22:%225DF1363059675161A85F576D%22%7D\"]")));
        VodaItem.SelectItem1().click();
        Thread.sleep(2000);
    }

    @Then("user add to cart the item")
    public void AddToCart() throws InterruptedException {
        Hooks.driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
        VodaItem.AddToCart().isDisplayed();
        VodaItem.AddToCart().click();
        Thread.sleep(2000);
        boolean Oncart = VodaItem.Assertion().isDisplayed();
        Soft.assertEquals(true,Oncart);
        Soft.assertAll();

    }

    ///////////////////////SECOND_ITEM////////////////////////

    @When("user navigate to audio")
    public void usergetdeals() throws InterruptedException {
        Thread.sleep(5000);
        WebDriverWait Audio = new WebDriverWait(Hooks.driver,Duration.ofSeconds(5));
        Audio.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=\"Gaming \"]")));
        VodaItem.Category2().click();
        VodaItem.SelectDeals().click();
        Thread.sleep(1000);
        VodaItem.AudioDeals().click();
        Thread.sleep(2000);
    }
    @And("user select second item")
    public void Select_Another_item() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Hooks.driver,Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("img[src=\"https://eshop.vodafone.com.eg/ecommerce/api/asset/content/121127339-1.png?contextRequest=%7B%22forceCatalogForFetch%22:false,%22applicationId%22:%2201H5FECVAV4YWT0NGQKXEN1T51%22,%22tenantId%22:%225DF1363059675161A85F576D%22%7D\"]")));
        VodaItem.SecondItem().click();
        Thread.sleep(2000);
    }
             ///////////////////////////Third Item/////////////////////////////
    @When("user search for item")
    public void UserNavigateToSearchBar() throws InterruptedException {
     VodaItem.UserOpenSearchBar().sendKeys("Samsung Galaxy A14");

    }
    @And("User select samsung")
    public void samsung(){
        WebDriverWait waait = new WebDriverWait(Hooks.driver,Duration.ofSeconds(10));
        waait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[text()=\"Samsung Galaxy A14 \"]")));
        Act.moveToElement(VodaItem.OPPO()).click();


    }
}

