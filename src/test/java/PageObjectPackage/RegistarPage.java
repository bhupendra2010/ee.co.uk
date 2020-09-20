package PageObjectPackage;

import CommonPackage.DriverFactory;
import org.openqa.selenium.By;

public class RegistarPage  extends DriverFactory {

    public void registar(){
        driver.findElement(By.xpath("//a[@class='js-eed-header-auth eed-header-utility__link eed-header-auth eed-header__control eed-header__control--right eed-header__account eed-header-auth--logged-out eed-loginregister initialized']")).click();

    }
}
