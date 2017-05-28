package motorspage;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Md.Golam Robbani on 5/23/2017.
 */
public class MotorsPage extends CommonAPI {
    @FindBy(how = How.CSS, using = ".hl-cat-nav__js-tab>a")
    public static WebElement sectionMotors;
    @FindBy(how = How.CSS, using = "#inv-lnav")
    public static WebElement sectionMyvehicles;
    @FindBy(how = How.CSS, using = "#inv-lnav")
    public static WebElement sectionShopbycategory;
    @FindBy(how = How.CSS, using = "#inv-lnav")
    public static WebElement sectionDealsAndEvents;
    @FindBy(how = How.CSS, using = "#inv-lnav")
    public static WebElement sectionBeInspired;

    public static WebElement getSectionMotors() {
        return sectionMotors;
    }
    public static WebElement getSectionMyvehicles() {
        return sectionMyvehicles;
    }
    public static WebElement getSectionShopbycategory() {
        return sectionShopbycategory;
    }
    public static WebElement getSectionDealsAndEvents() {
        return sectionDealsAndEvents;
    }
    public static WebElement getSectionBeInspired() {
        return sectionBeInspired;
    }

    public void goToSectionMotors() {getSectionMotors().click();}
    public void goToSectionMyvehicles() {getSectionMotors().click();getSectionMyvehicles().click();}
    public void goToSectionShopbycategory() {getSectionMotors().click();getSectionShopbycategory().click();}
    public void goToSectionDealsAndEvents() {getSectionMotors().click();getSectionDealsAndEvents().click();}
    public void goToSectionBeInspired() {getSectionMotors().click();getSectionBeInspired().click();}




}
