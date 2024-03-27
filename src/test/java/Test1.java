import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","/Users/sekharpulavarthi/Desktop/chromedriver-mac-arm64-v122/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.netflix.com/in/");
        driver.quit();

    }
}