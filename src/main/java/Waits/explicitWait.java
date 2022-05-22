package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Clock;
import java.util.concurrent.TimeUnit;

//permite indicar un tiempo explicito de cuánto debe esperar cada que sea invocado//


public class explicitWait {
    public static void main(String [] Args) {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");

        String url = "https://demoqa.com/dynamic-properties";

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,)

        driver.get(url);

        driver.manage().window().maximize();

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
            WebElement button = driver.findElement(By.id("visibleAfter"));
            button.click();
            System.out.println("Botón clickeado");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
