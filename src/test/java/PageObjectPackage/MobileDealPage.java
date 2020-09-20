package PageObjectPackage;

import CommonPackage.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class MobileDealPage extends DriverFactory {

    public void baseurl(){
        String actual=driver.getCurrentUrl();
        Assert.assertEquals(actual, "https://ee.co.uk/");
       // driver.switchTo().frame(0).manage().getCookies();
        //System.out.println(driver.manage().getCookies());
        //driver.findElement(By.id("cookie-template")).click();

    }
    public void  shop(){
        //driver.findElement(By.id("eed-business-segment")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"accessible-megamenu-1600630435021-2\"]/span[1]")));
        driver.findElement(By.xpath("//*[@id=\"accessible-megamenu-1600630435021-2\"]/span[1]")).click();
//driver.findElement(By.xpath("//span[@class='js-eed-off-nav-menu-text eed-off-nav-menu__text eed--hover'][contains(text(),'Why EE')]")).click();
        //driver.findElement(By.xpath("//*[@id=\"accessible-megamenu-1600459534955-4\"]/span[1]")).click();
        //actions.moveToElement(driver.findElement(By.cssSelector("span[class='js-eed-off-nav-menu-text eed-off-nav-menu__text eed--hover']"))).build().perform();
        //actions.moveToElement(driver.findElement(By.linkText("Pay monthly phones"))).click().build().perform();
    }

}
