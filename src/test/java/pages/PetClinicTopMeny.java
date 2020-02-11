package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PetClinicTopMeny {

    public static WebElement findOwnersButton(WebDriver browser){
        WebElement element = browser.findElement(By.linkText("Find owners"));
        return element;
    }
}
