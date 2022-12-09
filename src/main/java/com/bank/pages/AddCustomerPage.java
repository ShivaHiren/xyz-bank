package com.bank.pages;

import com.bank.utility.Utility;
import javafx.scene.control.Tab;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {



    //    click On "Add Customer" Tab
    By clickOnAddCustomer = By.xpath("//button[@ng-click='addCust()']");

    //    enter FirstName
    By firstNameField = By.xpath("//input[@placeholder='First Name']");

//    enter LastName
    By lastNameField = By.xpath("//input[@placeholder='Last Name']");

//    enter PostCode
    By enterPostcode  = By.xpath("//input[@placeholder='Post Code']");

//    click On "Add Customer" Button
    By addCustomer = By.xpath("//button[@type='submit']");


    public void clickOnAddCustomer(){
        clickOnElement(clickOnAddCustomer);
    }
    public void enterFirstNameField(String firstname){
        sendTextToElement(firstNameField,firstname);
    }
    public void enterLastNameField(String lastName){
        sendTextToElement(lastNameField,lastName);
    }
    public void enterPostcode(String postcode){
        sendTextToElement(enterPostcode, postcode);
    }
    public void clickOnAddCustomerTab(){
        clickOnElement(addCustomer);
    }
    public void clickOnPop(){
        acceptAlert();
    }
    public String getPopMessage(){
        return getTextFromAlert();
    }

}
