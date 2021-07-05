package Pages;

import Configuration.TestRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage  extends TestRunner{


    public void Search(String text){
         driver.findElement(By.name("q")).sendKeys(text); // finding element by name  selector "q" and sendint text argument to the search
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER); // clicking enter to launch searching request
        driver.findElement(By.name("q")).clear(); // clear method to have empty search field

    }
    }
