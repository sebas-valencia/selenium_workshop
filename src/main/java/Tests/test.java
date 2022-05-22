package Tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test  {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\juan.valenciat\\Documents\\Yuxi\\ProyectoSelenium\\selenium_workshop\\src\\main\\resources\\drivers\\chromedriver.exe");

        // Initialize browser
        WebDriver driver = new ChromeDriver();

        // Open Facebook
        driver.get("https://google.com");

        // Maximize browser

        driver.manage().window().maximize();

       // driver.close();
    }

}
