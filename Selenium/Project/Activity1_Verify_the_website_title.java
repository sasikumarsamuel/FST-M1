package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity1_Verify_the_website_title {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        //Open a browser and navigate to url
        driver.get("http://alchemy.hguy.co/orangehrm");
        driver.manage().window().maximize();

        //Get the title of the website.
        String actualTitle = driver.getTitle();
        System.out.println("Page Title as: " + actualTitle);

        //Make sure it matches “OrangeHRM” exactly.
        String expectedTitle = "OrangeHRM";
        if(actualTitle.equalsIgnoreCase(expectedTitle))
            System.out.println("Title Matched");
        else
            System.out.println("Title didn't match");
        //If it matches, close the browser.
        driver.close();

    }

}


