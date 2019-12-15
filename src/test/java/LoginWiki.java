import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginWiki {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
    }

    @Test
    public void openWikipediaTest() throws InterruptedException {
        driver.get("https://www.wikipedia.org/");
        Thread.sleep(2500);
        driver.findElement(By.id("js-link-box-en")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("pt-login")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("wpName1")).click();
        Thread.sleep(500);
        driver.findElement(By.id("wpName1")).clear();
        Thread.sleep(500);
        driver.findElement(By.id("wpName1")).sendKeys("mail@mail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("wpPassword1")).click();
        Thread.sleep(500);
        driver.findElement(By.id("wpPassword1")).clear();
        Thread.sleep(500);
        driver.findElement(By.id("wpPassword1")).sendKeys("password");
        Thread.sleep(1000);
        driver.findElement(By.id("wpLoginAttempt")).click();
        Thread.sleep(1000);

    }
    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
}