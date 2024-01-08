package tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import page.objects.*;

public class ShoppingCartTests extends TestBase {
    @Test
    public void asNotLoggedInUserIShallNotProceedToCheckout(){
        LandingPage landingPage = new LandingPage();
        landingPage.clickOnEnterStoreLink();

        LoginPage loginPage = new LoginPage();
        loginPage.clickOnFishImage();

        FishListPage fishListPage = new FishListPage();
        fishListPage.clickOnAngelfishId();

        AngelfishListPage angelfishListPage = new AngelfishListPage();
        angelfishListPage.clickOnAddToCartSmallAngelfish();

        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
        shoppingCartPage.clickOnProceedToCheckout();


        AssertJUnit.assertEquals(loginPage.getWarningMessage(), "You must sign on before attempting to check out. Please sign on and try checking out again.");
    }

}
