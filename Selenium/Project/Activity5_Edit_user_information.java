package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity5_Edit_user_information {

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
        //Find the “My Info” menu item and click it.
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
        Thread.sleep(3000);
        //On the new page, click the Edit button.
        driver.findElement(By.id("btnSave")).click();
        Thread.sleep(3000);
        //Fill in the Name, Gender, Nationality, and the DOB fields
        WebElement fName = driver.findElement(By.id("personal_txtEmpFirstName"));
        WebElement lName = driver.findElement(By.id("personal_txtEmpLastName"));
        fName.clear();
        lName.clear();
        fName.sendKeys("Sasikumar");
        lName.sendKeys("Samuel");
        //Gender
        driver.findElement(By.id("personal_optGender_1")).click();
        //Nationality
        WebElement nationality = driver.findElement(By.id("personal_cmbNation"));
        Select dropdown = new Select(nationality);
        dropdown.selectByVisibleText("Indian");
        //DOB
        WebElement dob = driver.findElement(By.id("personal_DOB"));
        dob.clear();
        dob.sendKeys("1992-10-31");
        //Click Save.
        driver.findElement(By.id("btnSave")).click();
        Thread.sleep(3000);
        //Close the browser
        driver.close();
    }
}