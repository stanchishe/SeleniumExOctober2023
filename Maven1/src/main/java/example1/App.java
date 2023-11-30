package example1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 * Hello Google!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Chrome example:
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("Start-Maximized");
        WebDriver chromeDriver = new ChromeDriver(chromeOptions);
        chromeDriver.get("https://www.google.bg/");

        //chromeDriver.close();
        //chromeDriver.quit();

        // Edge example:
        WebDriverManager.edgedriver().setup();
        EdgeOptions edgeOptions = new EdgeOptions().addArguments("Start-Maximized");
        WebDriver edgeDriver = new EdgeDriver(edgeOptions);
        edgeDriver.get("https://www.google.bg/");

        // edgeDriver.close();
        // edgeDriver.quit();

        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions firefoxOptions = new FirefoxOptions().addArguments("Start-Maximized");
        WebDriver firefoxDriver = new FirefoxDriver(firefoxOptions);
        firefoxDriver.get("https://www.google.bg/");

        //firefoxDriver.close();
        //firefoxDriver.quit();
    }
}
