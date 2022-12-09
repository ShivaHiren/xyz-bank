package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
    By accountLogin = By.xpath("//button[contains(text(),'Login')]");
    By depositButton = By.xpath("//button[@ng-click='deposit()']");
    By enterAmount = By.xpath("//input[@placeholder='amount']");
    By clickOnDepositButton = By.xpath("//button[@type='submit']");
    By withdrawlButton = By.xpath("//button[@ng-click='withdrawl()']");
    By clickOnWithdrawButton = By.xpath("//button[@type='submit']");

    public void clickOnWithdrawButton(){
        clickOnElement(clickOnWithdrawButton);
    }

    public void withdrawlButton(){
        clickOnElement(withdrawlButton);
    }
    public void clickOnDeposit(){
        clickOnElement(clickOnDepositButton);
    }

   public void enterAmount(String amount){
       sendTextToElement(enterAmount,amount);
   }

    public void clickOnDepositButton(){
        clickOnElement(depositButton);
    }
    public void clickOnLoginButton(){
        clickOnElement(accountLogin);
    }
//button[@type='submit']
}
