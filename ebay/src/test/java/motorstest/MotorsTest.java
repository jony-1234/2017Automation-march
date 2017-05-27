package motorstest;

import base.CommonAPI;

import motorspage.MotorsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.TestLogger;

/**
 * Created by Md.Golam Robbani on 5/23/2017.
 */
public class MotorsTest extends CommonAPI {
    @Test
    public void motorspage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        MotorsPage motorsPage = PageFactory.initElements(driver, MotorsPage.class);
        motorsPage.goToSectionMotors();
    }
    @Test
    public void myvehiclespage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        MotorsPage motorsPage = PageFactory.initElements(driver, MotorsPage.class);
        motorsPage.goToSectionMyvehicles();
    }
    @Test
    public void shopbycategorypage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        MotorsPage motorsPage = PageFactory.initElements(driver, MotorsPage.class);
        motorsPage.goToSectionShopbycategory();
    }
    @Test
    public void dealsandeventspage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        MotorsPage motorsPage = PageFactory.initElements(driver, MotorsPage.class);
        motorsPage.goToSectionDealsAndEvents();
    }
    @Test
    public void beinspiredpage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        MotorsPage motorsPage = PageFactory.initElements(driver, MotorsPage.class);
        motorsPage.goToSectionBeInspired();
    }

}
