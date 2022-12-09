package com.bank.pages;

import com.bank.utility.Utility;
import javafx.scene.control.Tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class OpenAccountPage extends Utility {

//    click On "Open Account" Tab
    By openAccountTab = By.xpath("//button[@ng-click='openAccount()']");

    By customerName = By.xpath("//select[contains@='Jhon Wick']");

    //    Select currency "Pound"
    By currencyPound = By.xpath("//select[@id='currency']");

    //    click on "process" button
    By processButton = By.xpath("//button[contains(text(),'Process')]");

    public void openAccount() {
        clickOnElement(openAccountTab);
    }

    public void customerName() {
        Select productOrder = new Select(driver.findElement(By.xpath("//select[@id='userSelect']")));
        productOrder.selectByIndex(1);
    }

    public void currencyPound() {
        Select productOrder = new Select(driver.findElement(By.xpath("//select[@id='currency']")));
        productOrder.selectByIndex(2);

    }

    public void processButton(){
        clickOnElement(processButton);
    }
    public void findCustomer(){
        WebElement findcustomer;


    }
}
