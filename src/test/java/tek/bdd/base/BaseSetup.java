package tek.bdd.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


public abstract class BaseSetup {
    private static WebDriver driver;
    private final Properties properties;

    //Find the full path to file
    //FileInputStream to read the file
    //Properties and load the FileInputStream to the properties
    public BaseSetup() {
        //System.getProperty("user.dir") return the locator of your project.
        try {
            String configFilePath = System.getProperty("user.dir") +
                    "/src/test/resources/configs/dev-config.properties";
            File file = new File(configFilePath);
            FileInputStream fileInputStream = new FileInputStream(file);
            properties = new Properties();
            properties.load(fileInputStream);
        }catch (IOException ex) {
            throw new RuntimeException("Something wrong with Config file", ex);
        }
    }



    public void setupBrowser(){
        ChromeOptions options =new ChromeOptions();
        options.addArguments("--headless");
        driver=new ChromeDriver(options);
        String url=properties.getProperty("ui.url");
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public void quitBrowser(){
        if(driver!=null){
            driver.quit();
        }
    }
}
