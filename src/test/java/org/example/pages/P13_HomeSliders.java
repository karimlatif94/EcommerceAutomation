package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P13_HomeSliders {

    public WebElement LumiaSlider(){
        By lumiaSlider = By.xpath("//a[@style=\"display: block;\"]");
        return Hooks.driver.findElement(lumiaSlider);
    }

    public WebElement iPhoneSlider(){
        By iphoneSlider = By.xpath("//a[@style=\"display: none;\"]");
        return Hooks.driver.findElement(iphoneSlider);
    }
}
