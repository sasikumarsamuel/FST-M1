package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3_Logging_into_the_site {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        //Open a browser and navigate to url
        driver.get("http://alchemy.hguy.co/orangehrm");
        driver.manage().window().maximize();

        //Find and select the username and password fields
        WebElement userName = driver.findElement(By.id("txtUsername"));
        WebElement passWord = driver.findElement(By.id("txtPassword"));
        //Enter login credentials into the respective fields
        userName.sendKeys("orange");
        passWord.sendKeys("orangepassword123");
        //Click login
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(5000);

        //Verify that the homepage has opened.
        String homePageTitle = driver.getTitle();
        System.out.println("Page Title as: " + homePageTitle);
        //Close the browser
        driver.close();
    }
}
