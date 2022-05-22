package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class locators {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\juan.valenciat\\Documents\\Yuxi\\ProyectoSelenium\\selenium_workshop\\src\\main\\resources\\drivers\\chromedriver.exe");

        //Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        //Open SauceDemo
        driver.get("https://saucedemo.com/");

        //Maximize the browser
        driver.manage().window().maximize();

        //Credentials
        String username = "standard_user";
        String password = "secret_sauce";

        //locators by ID
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
//        WebElement loginBtn = driver.findElement(By.id("login-button"));

        //Locators by CLASS NAME

//        WebElement loginBtn = driver.findElement(By.className("submit-button"));

        //locators by Name

//        WebElement loginBtn = driver.findElement(By.name("login-button"));

        //Locators by Xpath

//        WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));

        //Locators by Css

          WebElement loginBtn = driver.findElement(By.cssSelector("input.submit-button"));

        //Login
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }
}
