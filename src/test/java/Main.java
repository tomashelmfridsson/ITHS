import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.PetClinicTopMeny;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://127.0.0.1:9966/petclinic");
        //WebElement findOwnersButton = driver.findElement(By.linkText("Find owners"));
        //findOwnersButton.click();
        PetClinicTopMeny.findOwnersButton(driver).click();

    }
}
