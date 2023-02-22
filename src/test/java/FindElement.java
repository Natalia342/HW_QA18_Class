import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class FindElement {
    WebDriver wd;
    @BeforeMethod
    public void preCondition(){
        wd= new ChromeDriver();
        wd.navigate().to("https://telranedu.web.app/login");
    }
    @Test
    public void testFind(){
        WebElement id = wd.findElement(By.id("root"));
        System.out.println(id);
        List<WebElement> list = wd.findElements(By.tagName("a"));
        System.out.println(list.size());
        WebElement text = wd.findElement(By.partialLinkText("HO"));
        System.out.println(text);
        WebElement container = wd.findElement(By.className("container"));
        System.out.println(container);
        List<WebElement> div = wd.findElements(By.tagName("div"));
        System.out.println(div.size());
        WebElement text2 = wd.findElement(By.linkText("ABOUT"));
        System.out.println(text2);
        List<WebElement> script = wd.findElements(By.tagName("script"));
        System.out.println(script.size());
    }
    @AfterMethod
    public void postCondition(){
    //    wd.quit();
    }
}
