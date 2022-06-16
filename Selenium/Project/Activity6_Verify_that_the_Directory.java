import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6_Verify_that_the_Directory {

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

        //Verify that the “Directory” menu item is visible and clickable.
        boolean visible =  driver.findElement(By.id("menu_directory_viewDirectory")).isDisplayed();
        boolean clickable =driver.findElement(By.id("menu_directory_viewDirectory")).isEnabled();

        if (visible == true && clickable == true) {
            //If clickable, click on the menu item.
            driver.findElement(By.id("menu_directory_viewDirectory")).click();
            Thread.sleep(3000);
        }
        //Verify that the heading of the page matches “Search Directory"
        String searchDirectory = driver.findElement(By.xpath("//div[@class ='head']/h1")).getText();
        if (searchDirectory.equalsIgnoreCase("Search Directory")){
            System.out.println("Heading of the page matches :"+searchDirectory);
        }else
        System.out.println("Heading of the page doesn't matched");

        //close the browser
        driver.close();
    }

}
