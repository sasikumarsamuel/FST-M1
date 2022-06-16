import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity8_Applying_for_a_leave {

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
        //Navigate to the Dashboard page and click on the Apply Leave option
        driver.findElement(By.xpath("//span[text() ='Apply Leave']")).click();
        Thread.sleep(3000);
        //Select leave type and duration of the leave
        WebElement leave = driver.findElement(By.id("applyleave_txtLeaveType"));
        Select selLeave = new Select(leave);
        selLeave.selectByVisibleText("DayOff");
        WebElement fromDate = driver.findElement(By.id("applyleave_txtFromDate"));
        fromDate.clear();
        fromDate.sendKeys("2022-04-01");
        WebElement toDate=driver.findElement(By.id("applyleave_txtToDate"));
        toDate.clear();
        toDate.sendKeys("2022-04-02");
        //Click Apply.
        driver.findElement(By.id("applyBtn")).click();
        Thread.sleep(3000);
        //Navigate to the My Leave page to check the status of the leave application.
        driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
        Thread.sleep(5000);
        String approvalStatus = driver.findElement(By.xpath("//input[@id ='hdnLeaveRequestStatus_1']/preceding-sibling::a")).getText();
        System.out.println("Leave approval status:"+approvalStatus);
        //Close the browser.
        driver.close();
    }
}
