package ebaytest;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.TestLogger;

/**
 * Created by Md.Golam Robbani on 5/21/2017.
 */

     public class EbayTest extends CommonAPI {

        @Test
    public void homepage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.goToSectionHome();
    }
    @Test
    public void followingpage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.goToSectionFollowing();
    }
    @Test
    public void motorspage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.goToSectionMotors();
    }
    @Test
    public void fashionpage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.goToSectionFashion();
    }
    @Test
    public void electronicspage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.goToSectionElectronics();
    }
    @Test
    public void collectiblespage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.goToSectionCollectibles();
    }
    @Test
    public void homeandgardenpage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.goToSectionHomeAndGarden();
    }
    @Test
    public void sportinggoodspage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.goToSectionSportingGoods();
    }
    @Test
    public void toyspage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.goToSectionToys();
    }
    @Test
    public void businessandindustrialpage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.goToSectionBusinessAndIndustrial();
    }
    @Test
    public void musicpage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.goToSectionMusic();
    }
    @Test
    public void dealspage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.goToSectionDeals();
    }
    @Test
    public void dailydealspage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.goToSectionDailyDeals();
    }
    @Test
    public void giftcardspage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.goToSectionGiftCards();
    }
    @Test
    public void helpandcontactpage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.goToSectionHelpAndContact();
    }
    @Test
    public void sellpage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.goToSectionSell();
    }
    @Test
    public void myebaypage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.goToSectionMyeBay();
    }
    @Test
    public void advancedpage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.goToSectionAdvanced();
    }
    @Test
    public void allcategoriespage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.goToSectionAllCategories();
    }
     }





