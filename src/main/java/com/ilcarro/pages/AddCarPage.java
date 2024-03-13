package com.ilcarro.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;


import java.time.Duration;
import java.util.List;


public class AddCarPage extends BasePage {
    public AddCarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".positive-button.ng-star-inserted")
    WebElement positiveButton;

    public AddCarPage clickOkButton() {
        positiveButton.click();
        return this;
    }

    @FindBy(xpath = "//body/app-root[1]/app-navigator[1]/app-search[1]/app-footer[1]/div[1]/div[3]/a[2]")
    WebElement formLink;

    public AddCarPage clickFormLink() {
        formLink.click();
        return this;
    }

    @FindBy(id = "pickUpPlace")
    WebElement locationOption;

    public AddCarPage selectLocationOption(String address) {
        type(locationOption, address);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[1]")));
        driver.findElement(By.xpath("//body/div[1]"));
        locationOption.sendKeys(Keys.ARROW_DOWN);
        locationOption.sendKeys(Keys.ENTER);

        return this;
    }

    @FindBy(id = "make")
    WebElement makeInput;
    @FindBy(id = "model")
    WebElement modelInput;
    @FindBy(id = "year")
    WebElement yearInput;

    @FindBy(id = "seats")
    WebElement seatsInput;
    @FindBy(id = "class")
    WebElement carClassInput;
    @FindBy(id = "serialNumber")
    WebElement serialNumberInput;
    @FindBy(id = "price")
    WebElement priceInput;
    @FindBy(id = "about")
    WebElement aboutInput;


    public AddCarPage fillFieldsForm(String makeValue, String modelValue,
                                     String yearValue,
                                     String seatsValue, String classValue,
                                     String serialValue, String priceValue,
                                     String aboutValue) {
        type(makeInput, makeValue);
        type(modelInput, modelValue);
        type(yearInput, yearValue);
        type(seatsInput, seatsValue);
        type(carClassInput, classValue);
        type(serialNumberInput, serialValue);
        type(priceInput, priceValue);
        type(aboutInput, aboutValue);

        return this;
    }

    @FindBy(id = "fuel")
    WebElement selectFuel;

    public AddCarPage fuelOption(String option) {
        Select select = new Select(selectFuel);
        select.selectByVisibleText(option);

        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            options.get(i).getText();
        }
        select.getFirstSelectedOption().getText();
        return this;

    }

    @FindBy(xpath = "//input[@id='photos']")
    WebElement photoInput;

    public AddCarPage uploadPhoto(String photo) {
        photoInput.sendKeys(photo);
        return this;
    }

    @FindBy(xpath = "//*[text()='Submit']")
    WebElement submitBtn;

    public AddCarPage submit() {
        click(submitBtn);
        return this;
    }

    @FindBy(xpath = "//h1[contains(@class, 'title') and contains(text(), 'Car added')]")
    WebElement message;

    public AddCarPage verify() {
        assert isElementDisplayed(message);
        return this;
    }


}

