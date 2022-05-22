package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

//Indica al webdriver que espere x cantidad de tiempo antes de que aparezca la excepción: No Such Element Exception//



public class implicitWait {
    public static void main(String [] Args) {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");

        String url = "https://demoqa.com/dynamic-properties";

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

        driver.get(url);

        driver.manage().window().maximize();

        try {
            WebElement button = driver.findElement(By.id("visibleAfter"));
            button.click();
            System.out.println("Botón clickeado");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
