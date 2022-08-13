package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class P06_Categories {
    public WebElement selectDigitalDownloadsCategory() {
        By DigitalDownloadsCategory = By.cssSelector("a[href=\"/digital-downloads\"]");
        WebElement selectedDDcategory = Hooks.driver.findElement(DigitalDownloadsCategory);
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(selectedDDcategory).click().build().perform();
        return selectedDDcategory;

    }

    public WebElement selectElectronicsOthersSubCategory() {
        By ElectronicsCategory = By.cssSelector("a[href=\"/electronics\"]");
        WebElement selectedElectCategory = Hooks.driver.findElement(ElectronicsCategory);
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(selectedElectCategory).build().perform();

        By OthersSubCategory = By.cssSelector("a[href=\"/others\"]");
        WebElement selectedOthersSubcategory = Hooks.driver.findElement(OthersSubCategory);
        action.moveToElement(selectedOthersSubcategory).click().build().perform();
        return selectedOthersSubcategory;
    }
    public WebElement selectBooksCategory() {
        By Books = By.cssSelector("a[href=\"/books\"]");
        WebElement BooksCategory = Hooks.driver.findElement(Books);
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(BooksCategory).click().build().perform();
        return BooksCategory;
    }
}
