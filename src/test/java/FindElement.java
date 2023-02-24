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
        WebElement text = wd.findElement(By.partialLinkText("HO"));
        System.out.println(text);
        WebElement container = wd.findElement(By.className("container"));
        System.out.println(container);
        WebElement text2 = wd.findElement(By.linkText("ABOUT"));
        System.out.println(text2);
        List<WebElement> script = wd.findElements(By.tagName("script"));
        System.out.println(script.size());
        List<WebElement> list = wd.findElements(By.tagName("a"));
        System.out.println(list.size());
        List<WebElement> div = wd.findElements(By.tagName("div"));
        System.out.println(div.size());


        wd.findElement(By.cssSelector("#root"));
        wd.findElement(By.cssSelector("div#root.container"));
        wd.findElement(By.cssSelector("div[id='root']"));

        wd.findElement(By.cssSelector("div.navbar-component_nav__1X_4m>a:nth-child(2)"));
        wd.findElement(By.cssSelector("a[href='/home']"));

        wd.findElement(By.cssSelector("div.container"));
        wd.findElement(By.cssSelector("#root.container"));
        wd.findElement(By.cssSelector(".container"));
        wd.findElement(By.cssSelector("div[id='root'].container"));
        wd.findElement(By.cssSelector("div#root.container"));

        wd.findElement(By.cssSelector("div.navbar-component_nav__1X_4m :nth-child(3)"));
        wd.findElement(By.cssSelector("div a[href='/about']"));
        wd.findElement(By.cssSelector("a[href='/about']"));

        List<WebElement> script1 = wd.findElements(By.cssSelector("script"));
        System.out.println(script1.size());
        wd.findElement(By.cssSelector("script[src='/static/js/2.03ed4652.chunk.js']"));
        wd.findElement(By.cssSelector("[src='/static/js/2.03ed4652.chunk.js']"));

        wd.findElements(By.cssSelector("a"));
        wd.findElements(By.cssSelector("div.navbar-component_nav__1X_4m [style]"));
        wd.findElements(By.cssSelector("div.navbar-component_nav__1X_4m [href]"));

        wd.findElements(By.cssSelector("div"));


    }
    @AfterMethod
    public void postCondition(){
    //    wd.quit();
    }
}
