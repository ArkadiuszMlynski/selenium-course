package tests;


import org.testng.annotations.Test;
import page.objects.FooterPage;
import page.objects.LandingPage;
import page.objects.LoginPage;
import page.objects.TopMenuPage;
import static org.testng.AssertJUnit.assertTrue;

public class PositiveLoginTests extends TestBase{

@Test
public void asUserLoginUsingValidLoginAndPassword(){
    LandingPage landingPage = new LandingPage();
    landingPage.clickOnEnterStoreLink();

    TopMenuPage topMenuPage = new TopMenuPage();
    topMenuPage.clickOnSignInLink();

    LoginPage loginPage = new LoginPage();
    loginPage.typeIntoUserNameField("j2ee");
    loginPage.typeIntoPasswordField("j2ee");
    loginPage.clickOnLoginButton();
    FooterPage footerPage = new FooterPage();
    assertTrue(footerPage.isBannerAfterLoginDisplayed());


    }
}
