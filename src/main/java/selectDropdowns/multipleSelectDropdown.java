package selectDropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class multipleSelectDropdown {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");

        //instance Driver//
        WebDriver driver = new ChromeDriver();

        //URL//
        String url = "https://demoqa.com/select-menu";
        driver.get(url);
        driver.manage().window().maximize();

        Select cars = new Select(driver.findElement(By.id("cars")));

        //Select by value//
        cars.selectByValue("saab");
        cars.selectByValue("audi");

        //select by visible text//
        cars.selectByVisibleText("Opel");

        //select by Index//
        cars.selectByIndex(0);

        //deselect ALl//
        //cars.deselectAll();//


    }
}



