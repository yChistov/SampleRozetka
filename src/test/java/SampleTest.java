import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SampleTest {

    @Test
    public void startURL() {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get("http://www.rozetka.com.ua");
        driver.findElement(By.name("signin")).click();
        driver.findElement(By.name("login")).sendKeys("misteriys@ukr.net");
        driver.findElement(By.name("password")).sendKeys("ghjuhfvbcn");
        driver.findElement(By.name("auth_submit")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='social_popup']/div/div")));
        driver.findElement(By.name("text")).sendKeys("gtx 980");
        driver.findElement(By.name("search-button")).click();
        driver.findElement(By.name("topurchases")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("cart-popup")));
        driver.navigate().back();
        driver.findElement(By.name("text")).sendKeys("i7");
        driver.findElement(By.name("search-button")).click();
        driver.findElement(By.name("topurchases")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("cart-popup")));
        driver.findElement(By.xpath("//*[@id='cart-popup']/div/div[1]/div[2]/div[1]/a/img")).click();
        driver.findElement(By.name("delete")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='cart-popup']/div/div[1]/div[2]/div/div[1]/a/img")));
        driver.findElement(By.xpath("//*[@id='cart-popup']/div/div[1]/div[2]/div/div[1]/a/img")).click();
        driver.findElement(By.xpath("//*[@id='cart-popup']/div/div[1]/div[2]/div/div[1]/div/div/div[2]/a")).click();
        driver.navigate().back();
        driver.findElement(By.name("profile")).click();
        driver.findElement(By.xpath("//*[@id='personal_information']/div/ul/li[3]/a")).click();
    }
}