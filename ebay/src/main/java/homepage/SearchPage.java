package homepage;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Md.Golam Robbani on 5/21/2017.
 */
public class SearchPage extends CommonAPI {

    @FindBy(how = How.CSS, using = "#gh-btn")
    public static WebElement sectionSearch;

    @FindBy(how = How.CSS, using = "#gh-ac")
    public static WebElement sectionLaptop;

    @FindBy(how = How.CSS, using = "#gh-ac")
    public static WebElement sectionIphone;

    @FindBy(how = How.CSS, using = "#gh-ac")
    public static WebElement sectionWatch;

    @FindBy(how = How.CSS, using = "#gh-ac")
    public static WebElement sectionBags;

    @FindBy(how = How.CSS, using = "#gh-ac")
    public static WebElement sectionFan;


    public static WebElement getSectionSearch() {
        return sectionSearch;
    }
    public static WebElement getSectionLaptop() {
        return sectionLaptop;
    }
    public static WebElement getSectionIphone() {
        return sectionIphone;
    }
    public static WebElement getSectionWatch() {
        return sectionWatch;
    }
    public static WebElement getSectionBags() {
        return sectionBags;
    }
    public static WebElement getSectionFan() {
        return sectionFan;
    }

    public void goToSectionSearch() {getSectionSearch().click();}
    public void goToSectionLaptop() {getSectionLaptop().click();}
    public void goToSectionIphone() {getSectionIphone().click();}
    public void goToSectionWatch() {getSectionWatch().click();}
    public void goToSectionBags() {getSectionBags().click();}
    public void goToSectionFan() {getSectionFan().click();}
}

