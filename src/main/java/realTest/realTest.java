package realTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class realTest {
    public static void main (String [] args) {
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\drivers\\chromedriver.exe");

        String url = "https://www.linkedin.com";

        WebDriver driver = new ChromeDriver();

        driver.get(url);

        driver.manage().window().maximize();


    //credentials//

        String username = "sebastianvalencia@protonmail.com";
                                                                                                                     String password = "Ps$l1nk3d*";
        String message = "el coste se la mastica";

    //Locators//

        WebElement usernameInput = driver.findElement(By.id("session_key"));
        WebElement passwordInput = driver.findElement(By.id("session_password"));
        WebElement signIn = driver.findElement(By.className("sign-in-form__submit-button"));



        //login//
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        signIn.click();


        //find Elements//

        List<WebElement> conversations = driver.findElements(By.className(
                "msg-conversation-listitem__link"));
        System.out.println("how many elements did we find?" + conversations.size());

        for(int i = 0; i < conversations.size(); i++){
            if(i == 0){
                conversations.get(i).click();
            }
        }

       // WebElement writeField = driver.findElement(By.className("msg-form__contenteditable"));
        WebElement writeField = driver.findElement(By.xpath("//div[@role='textbox']"));

        writeField.click();
        writeField.sendKeys(message);


    }
}