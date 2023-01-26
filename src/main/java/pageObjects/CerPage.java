package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class CerPage {
    @FindBy(xpath = "//*[@name=\"certificate\"]")
    WebElement field;
    @FindBy(xpath = "//*[@id=\"certificateCheckForm\"]")
    WebElement msg;

    @Step("Check certificate number {number}")
    public boolean checkCER(String number) {
        try {
            field.sendKeys(number);
            field.sendKeys(Keys.ENTER);
            Thread.sleep(3000);
        } catch (ElementNotInteractableException ignore) {

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return !msg.getAttribute("class").contains("invalid");
    }


}
