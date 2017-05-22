package ebaytest;
import base.CommonAPI;

import homepage.SearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.TestLogger;

/**
 * Created by Md.Golam Robbani on 5/21/2017.
 */

public class SearchTest extends CommonAPI {

    @Test
    public void searchpage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.goToSectionSearch();
    }
    @Test
    public void laptoppage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.goToSectionLaptop();
    }
    @Test
    public void iphonepage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.goToSectionIphone();
    }
    @Test
    public void watchpage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.goToSectionWatch();
    }
    @Test
    public void bagspage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.goToSectionBags();
    }
    @Test
    public void fanpage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.goToSectionFan();
    }

}

