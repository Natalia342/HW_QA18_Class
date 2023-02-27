import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TableTest {
    WebDriver wd;
    @BeforeMethod
    public void preCondition(){
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
    }
    @Test
    public void tableHW2(){
        List<WebElement> tableRows = wd.findElements(By.cssSelector("#customers>tbody>tr"));//#customers tr
        System.out.println(tableRows.size());
        List<WebElement> tableColumns = wd.findElements(By.cssSelector("table#customers>tbody>tr th"));//table#customers th
        System.out.println(tableColumns.size());


        WebElement element = wd.findElement(By.cssSelector("#customers tr:nth-child(3)"));
        WebElement element1 = wd.findElement(By.cssSelector("#customers>tbody>tr>th:last-child,td:nth-child(3)"));//("table#customers>tbody>tr th:nth-child(3)"));//#customers td:nth-child(3)
    }
    @BeforeMethod
    public void postCondition(){
    //    wd.quit();
    }
}
