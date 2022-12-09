package com.bank.pages;

import com.bank.utility.Utility;
import javafx.scene.control.Tab;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CustomerLoginPage extends Utility {

    //    click on "Login" Button
    By loginButton = By.xpath("//button[contains(text(),'Login')]");

    //    click on "Logout"
    By logoutButton = By.xpath("//button[contains(text(),'Logout')]");

    //    verify "Your Name" text displayed.
    public void yourName() {
        Select nameOrder = new Select(driver.findElement(By.xpath("//select[@id='userSelect']")));
        nameOrder.selectByIndex(4);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public void clickOnLogoutButton() {
        clickOnElement(logoutButton);
    }
}
