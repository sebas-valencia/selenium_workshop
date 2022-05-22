package dragAndDrop;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

    public static void main(String [] args) throws InterruptedException {
        String url = "https://demoqa.com/droppable";

        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();

        //Instantiate the actions class//

        Actions action = new Actions(driver);

        //Define the from and to""

        WebElement from = driver.findElement(By.id("draggable"));
        WebElement to = driver.findElement(By.id("droppable"));

        //Use the method dragAndDrop//
        action.dragAndDrop(from,to).build().perform();

        //you can also use the X and Y properties//

        action.dragAndDropBy(from, 199,36).build().perform();


    }

}
