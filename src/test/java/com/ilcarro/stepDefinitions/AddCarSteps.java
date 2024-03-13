package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.AddCarPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


import static com.ilcarro.pages.BasePage.driver;

public class AddCarSteps {


    @And("User clicks on Ok button")
    public void click_Ok_button() {
        new AddCarPage(driver).clickOkButton();
    }


    @And("User clicks Let the car work link")
    public void clicks_LetTheCarWork_link() {
        new AddCarPage(driver).clickFormLink();
    }


    @And("User fills Location field")
    public void fills_Location_field() {
        new AddCarPage(driver).selectLocationOption("Tel Aviv");
    }


    @And("User fills all form fields")
    public void fill_fieldsForm() {
        new AddCarPage(driver).fillFieldsForm(
                "Merc",
                "C200",
                "2000",
                "2",
                "Comfort",
                "585849944",
                "50",
                "Car of ur dream");
    }

    @And("User fills fuelOption")
    public void select_fuelOption(){
        new AddCarPage(driver).fuelOption("Gas");
    }

    @And("User uploads photo of the car")
    public void uploadCarPhoto() {
        new AddCarPage(driver).uploadPhoto("C:\\GitHubQA\\car.png");
    }

    @And("User clicks on Submit button")
    public void clickSubmitButton() {
        new AddCarPage(driver).submit();
    }

    @Then("User verifies Success message")
    public void verifyMessage() {
        new AddCarPage(driver).verify();
    }


}

