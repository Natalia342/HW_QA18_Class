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
        wd.navigate().to("https://telranedu.web.app/home");
    }
    @Test
    public void testFind(){
        WebElement id = wd.findElement(By.id("root"));
        System.out.println(id);
        List<WebElement> list = wd.findElements(By.tagName("meta"));
        System.out.println(list.size());
        WebElement element = wd.findElement(By.name("viewport"));
        System.out.println(element);
        WebElement text = wd.findElement(By.partialLinkText("HOME"));
        System.out.println(text);
        WebElement container = wd.findElement(By.className("container"));
        System.out.println(container);
        List<WebElement> div = wd.findElements(By.tagName("div"));
        System.out.println(div.size());
        WebElement text2 = wd.findElement(By.linkText("LOGIN"));
        System.out.println(text2);
        List<WebElement> link = wd.findElements(By.tagName("link"));
        System.out.println(link.size());
    }
    @AfterMethod
    public void postCondition(){
    //    wd.quit();
    }
}
