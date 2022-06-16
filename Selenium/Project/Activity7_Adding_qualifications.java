package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_Adding_qualifications {

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
        // Find the “My Info” menu item and click it.
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
        Thread.sleep(3000);
        //On the new page, find the Qualification option on the left side menu and click it
        //driver.findElement(By.linkText("Qualifications")).click();
        driver.findElement(By.xpath("(//a[text() ='Qualifications'])[2]")).click();
        Thread.sleep(3000);
        //Add Work Experience and click Save.
        driver.findElement(By.id("addWorkExperience")).click();
        driver.findElement(By.id("experience_employer")).sendKeys("IBM");
        driver.findElement(By.id("experience_jobtitle")).sendKeys("Test Engineer");
        driver.findElement(By.id("btnWorkExpSave")).click();
        Thread.sleep(5000);

        //Close the browser.
        driver.close();
    }
}