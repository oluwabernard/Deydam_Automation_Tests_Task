package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {
//import selenium driver
private WebDriver driver;
//import chrome driver
    public void setUp()throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
  //Get the project URL
  driver.get("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login");
  //Wait for Project page to Load
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 //maximize Project Page
 driver.manage().window().maximize();
 //Get Project Page Title
    System.out.println(driver.getTitle());
 //Locate username field
 driver.findElement(By.id("username")).sendKeys("MOUNTAIN");
 //LOCATE password field
    driver.findElement(By.id("password")).sendKeys("MOUNTAIN12");
    //LOCATE SIGN IN BUTTON AND CLICK
         driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/button")).click();
         //wait
        Thread.sleep(10000);
      //close window
      driver.quit();
    }
    //initiate
    public static void main(String args[]) throws InterruptedException {
        LoginTests tests =
                new LoginTests();
        tests.setUp();
    }
}
