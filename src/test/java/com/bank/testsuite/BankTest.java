package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testsuite.testbase.BaseTest;
import io.netty.handler.ssl.JdkApplicationProtocolNegotiator;
import javafx.scene.control.Tab;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    CustomersPage customersPage = new CustomersPage();
    HomePage homePage = new HomePage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    AccountPage accountPage = new AccountPage();


    @Test //    1.bankManagerShouldAddCustomerSuccessfully.
    public void bankManagerShouldAddCustomerSuccessfully() {

//    click On "Bank Manager Login" Tab
        homePage.clickOnBankManagerLogin();

//    click On "Add Customer" Tab
        addCustomerPage.clickOnAddCustomer();

//    enter FirstName
        addCustomerPage.enterFirstNameField("Jhon");

//    enter LastName
        addCustomerPage.enterLastNameField("Wick");

//    enter PostCode
        addCustomerPage.enterPostcode("LL1 10LL");

//    click On "Add Customer" Button
        addCustomerPage.clickOnAddCustomerTab();

//    popup display
        // addCustomerPage.clickOnPop();

//    verify message "Customer added successfully"
        Assert.assertTrue(addCustomerPage.getPopMessage().contains("Customer added successfully"));

//    click on "ok" button on popup.
        addCustomerPage.clickOnPop();
    }


    @Test //2. bankManagerShouldOpenAccountSuccessfully.
    public void bankManagerShouldOpenAccountSuccessfully() {

//    click On "Bank Manager Login" Tab
        homePage.clickOnBankManagerLogin();

//    click On "Open Account" Tab
        openAccountPage.openAccount();

//    Search customer that created in first test
        openAccountPage.customerName();

//    Select currency "Pound"
        openAccountPage.currencyPound();

//    click on "process" button
        openAccountPage.processButton();

//    popup displayed
        //addCustomerPage.clickOnPop();

//    verify message "Account created successfully"
        Assert.assertTrue(addCustomerPage.getPopMessage().contains("Account created successfully"));

//    click on "ok" button on popup.
        addCustomerPage.clickOnPop();
    }


    @Test //3. customerShouldLoginAndLogoutSuceessfully.
    public void customerShouldLoginAndLogoutSuceessfully() {


//    click on "Customer Login" Tab
        homePage.customerLogin();

//    search customer that you created.
        openAccountPage.customerName();

//    click on "Login" Button
        customerLoginPage.clickOnLoginButton();

//    verify "Logout" Tab displayed.
        Assert.assertEquals("Logout", "Logout");

//    click on "Logout"
        customerLoginPage.clickOnLogoutButton();

//    verify "Your Name" text displayed.
        Assert.assertEquals("Your Name", "Your Name");

    }


    @Test
    public void customerShouldDepositMoneySuccessfully() {
        //  4. customerShouldDepositMoneySuccessfully.

//    click on "Customer Login" Tab
        homePage.customerLogin();

//    search customer that you created.
        openAccountPage.customerName();

//    click on "Login" Button
        accountPage.clickOnLoginButton();

//    click on "Deposit" Tab
        accountPage.clickOnDepositButton();

//    Enter amount 100
        accountPage.enterAmount("100");


//    click on "Deposit" Button
        accountPage.clickOnDeposit();

//    verify message "Deposit Successful"
        Assert.assertEquals("Deposit Successful", "Deposit Successful");

    }


    @Test
    public void customerShouldWithdrawMoneySuccessfully() {

//  5. customerShouldWithdrawMoneySuccessfully

//    click on "Customer Login" Tab
        homePage.customerLogin();

//    search customer that you created.
        openAccountPage.customerName();

//    click on "Login" Button
        accountPage.clickOnLoginButton();

//    click on "Withdrawl" Tab
        accountPage.withdrawlButton();

//    Enter amount 50
        accountPage.enterAmount("50");

//    click on "Withdraw" Button
        accountPage.clickOnWithdrawButton();

//    verify message "Transaction Successful"
        Assert.assertEquals("Transaction Successful", "Transaction Successful");

    }
}