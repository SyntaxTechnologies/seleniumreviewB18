package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;

import static Utils.ConfigReader.read;

public class CommonMethods {
    
 public  static WebDriver driver;
//    open the browser and launch the applicaiton
    public static void OpenBrowserAndLaunchApplication() throws IOException {
//        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(read("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public static void closeBrowser(){
        driver.quit();
    }
    
    
}
