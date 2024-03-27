import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.Set;



public class AmazonTest {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "/Users/sekharpulavarthi/Desktop/chromedriver-mac-arm64-v122/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulnxttrendz.ccbp.tech/login");
//        driver.navigate().to("https://rahulnxttrendz.ccbp.tech/login");

        WebElement first=driver.findElement(By.id("username"));
        first.sendKeys("rahul");
        WebElement second=driver.findElement(By.id("password"));
        second.sendKeys("rahul@2021");
        WebElement login=driver.findElement(By.tagName("button"));
        login.click();

        driver.manage().window().maximize();

        driver.navigate().back();

        String expected="https://rahulnxttrendz.ccbp.tech/login";

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.urlToBe(expected));

        driver.navigate().forward();

        driver.navigate().refresh();

    }
}
