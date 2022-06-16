package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2_Get_the_url_of_the_header_image {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        //Open a browser and navigate to url
        driver.get("http://alchemy.hguy.co/orangehrm");
        driver.manage().window().maximize();

        //Get the url of the header image
        String url = driver.findElement(By.xpath("//div[@id=\"divLogo\"]/img")).getAttribute("src");
        //Print the url to the console.
        System.out.println("url :"+url);
        Thread.sleep(3000);
        //Close the browser
        driver.close();
    }
    }
