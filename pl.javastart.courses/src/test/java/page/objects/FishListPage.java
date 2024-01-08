package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;

public class FishListPage {
    @FindBy(css = "tr:nth-child(2) a")
    private WebElement angelfishIdLink;
    private WebDriver driver;
    public FishListPage(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }
    public void clickOnAngelfishId(){
        angelfishIdLink.click();
    }
}
