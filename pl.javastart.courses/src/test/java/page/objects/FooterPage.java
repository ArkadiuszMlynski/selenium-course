package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;
import waits.WaitForElement;

public class FooterPage {

    @FindBy(css="#Banner img[src*='dog']")
    private WebElement bannerAfterLoginLogo;
    private WebDriver driver;

    public FooterPage(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }
    public boolean isBannerAfterLoginDisplayed(){
        WaitForElement.waitUntilElementIsVisible(bannerAfterLoginLogo);
        return bannerAfterLoginLogo.isDisplayed();
    }
}
