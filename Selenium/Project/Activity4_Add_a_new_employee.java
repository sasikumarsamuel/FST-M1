package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_Add_a_new_employee {


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

            //Find the PIM option in the menu and click it
            driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']/b")).click();
            Thread.sleep(3000);
            //Click the Add button to add a new Employee
            driver.findElement(By.id("btnAdd")).click();
            Thread.sleep(3000);
            //Fill in the required fields and click Save
            driver.findElement(By.id("firstName")).sendKeys("Sasi");
            driver.findElement(By.id("lastName")).sendKeys("Kumar");
            driver.findElement(By.id("btnSave")).click();
            Thread.sleep(3000);
            //Navigate back to the PIM page (Employee List tab) and verify the creation of your employee
            driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
            Thread.sleep(3000);
            driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("SSSS"+ Keys.TAB);
            driver.findElement(By.id("searchBtn")).click();
            String data = driver.findElement(By.xpath("//td[@class='left'][2]//a")).getText();
            if(data.equalsIgnoreCase("Siva")) {
                System.out.println(data);
            } else {
                String noRecords = driver.findElement(By.xpath("//td[text()='No Records Found']")).getText();
                System.out.println("No Matches records :" + noRecords);
                Thread.sleep(5000);
            }

            //Close the browser
            driver.close();

        }
    }

