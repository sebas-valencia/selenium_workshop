package findElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class findElements {
    public static void main(String[] args) {
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

        List<WebElement> inputs = driver.findElements(By.tagName("input"));
        System.out.println("how many elements did we find?" + inputs.size());

        for(int i = 0; i < inputs.size(); i++){
            if(i == 0){
                inputs.get(i).sendKeys(username);
            }
            else if (i == 1){
                inputs.get(i).sendKeys(password);
            }
            else{
                inputs.get(i).click();
            }
        }
        List<WebElement> buttons = driver.findElements(By.className("inventory_item_name"));
        System.out.println("how many elements did we find?" + buttons.size());
        for(int i = 0; i < buttons.size(); i++){
            if(i == 3){
               buttons.get(i).click(); ;
            }
        }
        WebElement addToCart = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));

        addToCart.click();

        WebElement shoppingCart = driver.findElement(By.className("shopping_cart_link"));

        shoppingCart.click();

        WebElement checkOut = driver.findElement(By.id("checkout"));

        checkOut.click();

        List<WebElement> infoBuy = driver.findElements((By.tagName("input")));
        System.out.println("how many inputs did we find?" + inputs.size());

        //infoBuy
        String firstName = "Juan";
        String lastName = "Valencia";
        String zipCode = "16001";

        for(int i = 0; i < infoBuy.size(); i++){
            if(i == 0){
                infoBuy.get(i).sendKeys(firstName);
            }
            else if (i == 1){
                infoBuy.get(i).sendKeys(lastName);
            }
            else{
                infoBuy.get(i).sendKeys(zipCode);
            }
        }

        WebElement continueButton = driver.findElement(By.id("continue"));

        continueButton.click();

        WebElement finishButton = driver.findElement(By.id("finish"));

        finishButton.click();
    }
}
