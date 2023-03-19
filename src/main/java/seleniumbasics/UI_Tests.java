package seleniumbasics;

import org.jetbrains.annotations.TestOnly;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UI_Tests {

    private WebDriver driver;

    @TestOnly

    void openGoogle(){
        //Browser driver exe file to open browser Chrome Driver
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\gigac\\Downloads\\chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        //Create chrome instance
        WebDriver driver=new ChromeDriver(co);
        //Open Chrome Browser
        driver.get("https://www.google.com");


        //System.out.println(driver.getTitle());
    }

}
