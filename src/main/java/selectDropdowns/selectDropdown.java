package selectDropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDropdown {

    public static void main(String [] args){

        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");

        //instance Driver//
        WebDriver driver = new ChromeDriver();

        //URL//
        String url = "https://demoqa.com/select-menu";
        driver.get(url);
        driver.manage().window().maximize();

        //Declare the object of UI Select:

        Select oldStyleMenu = new Select(driver.findElement((By.id("oldSelectMenu"))));

        //Select By Index//
        //oldStyleMenu.selectByIndex(3);//

        //Select By Value//
        //oldStyleMenu.selectByValue("8");//

        //Select By Text//
        //oldStyleMenu.selectByVisibleText("Voilet");//

        //Select By Multiple Select List//









    }
}
