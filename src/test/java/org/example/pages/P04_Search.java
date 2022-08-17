package org.example.pages;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P04_Search {

    public WebElement search() {
        By SearchTxtField = By.id("small-searchterms");
        return Hooks.driver.findElement(SearchTxtField);
    }

    public WebElement SearchBtn() {

        By Searchbtn = By.cssSelector("button[class=\"button-1 search-box-button\"]");
        return Hooks.driver.findElement(Searchbtn);
    }
    public List getProductResultList() {


        By resultList = By.cssSelector("div[class=\"product-item\"]");
        return Hooks.driver.findElements(resultList);
    }
    public WebElement productSKU(){
        return Hooks.driver.findElement(By.xpath("//div[@class=\"sku\"]"));
    }
}
