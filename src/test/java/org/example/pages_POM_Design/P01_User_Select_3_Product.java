package org.example.pages_POM_Design;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_User_Select_3_Product {
    public WebElement OPPO(){
        return Hooks.driver.findElement(By.xpath("//p[text()=\"Samsung Galaxy A14 \"]"));
    }
    public WebElement CookiesAccept(){
        return Hooks.driver.findElement(By.xpath("//button[@id=\"onetrust-accept-btn-handler\"]"));
    }
    public WebElement ClickForLogin(){
        return Hooks.driver.findElement(By.cssSelector("img[src=\"assets/icon-center/profile.svg\"]"));
    }
    public WebElement LoginID(){
        return Hooks.driver.findElement(By.cssSelector("input[id=\"username\"]"));
    }
    public WebElement Password(){
        return Hooks.driver.findElement(By.cssSelector("input[name=\"password\"]"));
    }
    public WebElement Submit(){
        return Hooks.driver.findElement(By.cssSelector("input[id=\"submitBtn\"]"));
    }
    public WebElement CategorySearch(){
        return Hooks.driver.findElement(By.xpath("//button[text()=\"Smart Phones \"]"));
    }
    public WebElement SelectDeals(){
        return Hooks.driver.findElement(By.xpath("//p[text()=\"Deals\"]"));
    }
    public WebElement SelectItem1(){
        return Hooks.driver.findElement(By.cssSelector("img[src=\"https://eshop.vodafone.com.eg/ecommerce/api/asset/content/121126890.png?contextRequest=%7B%22forceCatalogForFetch%22:false,%22applicationId%22:%2201H5FECVAV4YWT0NGQKXEN1T51%22,%22tenantId%22:%225DF1363059675161A85F576D%22%7D\"]"));
    }
    public WebElement AddToCart(){
        return Hooks.driver.findElement(By.xpath("//button[text()=\" Add To Cart \"]"));
    }
    public WebElement Assertion(){
        return Hooks.driver.findElement(By.xpath("//p[text()=\"Item added to cart successfully!\"]"));
    }
    public WebElement Category2(){
        return Hooks.driver.findElement(By.xpath("//button[text()=\"Gaming \"]"));
    }
    public WebElement AudioDeals(){
        return Hooks.driver.findElement(By.xpath("//p[text()=\" Audio Deals \"]"));
    }
    public WebElement SecondItem(){
        return Hooks.driver.findElement(By.cssSelector("img[src=\"https://eshop.vodafone.com.eg/ecommerce/api/asset/content/121127339-1.png?contextRequest=%7B%22forceCatalogForFetch%22:false,%22applicationId%22:%2201H5FECVAV4YWT0NGQKXEN1T51%22,%22tenantId%22:%225DF1363059675161A85F576D%22%7D\"]"));
    }
    public WebElement UserOpenSearchBar(){
        return Hooks.driver.findElement(By.xpath("//input[@placeholder=\"What you are looking for ?\"]"));
    }
}
