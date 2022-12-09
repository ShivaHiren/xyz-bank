package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    //    click On "Bank Manager Login" Tab
    By clickOnBankManagerLogin = By.xpath("//button[contains(text(),'Bank Manager Login')]");

    public void clickOnBankManagerLogin(){
        clickOnElement(clickOnBankManagerLogin);
    }

    //    click on "Customer Login" Tab
    By customerLogin = By.xpath("//button[contains(text(),'Customer Login')]");

    public void customerLogin(){
        clickOnElement(customerLogin);
    }


}
