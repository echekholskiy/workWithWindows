import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class workWithWindows{
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\nazhivka.by\\IdeaProjects\\testselenium\\drivers\\geckodriver.exe");
        driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.lamoda.by/");
        driver.findElement(By.xpath("//span[text()=\"Войти\"]")).click();
        driver.findElement(By.xpath("//span[@class='link auth-social__item auth-social__item_fb']")).click();
        for(String windowHandle:driver.getWindowHandles()){
            driver.switchTo().window(windowHandle);
        }
        driver.findElement(By.xpath("//a[text()='Забыли аккаунт?']")).click();

    }
}
