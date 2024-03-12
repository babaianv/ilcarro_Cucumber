package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class LoginSteps {

    @And("User clicks on Login Link")
    public void click_on_LoginLink(){
        new HomePage(driver).clickOnLoginLink();
    }

    @And("User enters valid data")
    public void enter_valid_data(){
        new LoginPage(driver).enterData("annasmith123@gm.com","Annasmith123!");
    }

    @And("User clicks on Yalla button")
    public void click_on_Yalla_button(){
        new LoginPage(driver).clickOnYallaButton();
    }

    @Then("User verifies Success message displayed")
    public void verify_Success_message_displayed(){
        new LoginPage(driver).isSuccessMessageDisplayed();
    }

    @And("User enters valid email and invalid password")
    public void enter_valid_email_invalid_password(DataTable dataTable){
        new LoginPage(driver).enterInvalidPassword(dataTable);
    }

    @Then("User verifies Error message displayed")
    public void verify_ErrorMessage(){
        new LoginPage(driver).isErrorDisplayed();
    }
}

