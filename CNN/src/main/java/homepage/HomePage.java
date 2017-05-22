package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

/**
 * Created by Md.Golam Robbani on 5/15/2017.
 */


public class HomePage extends CommonAPI {

    @FindBy(how = How.CSS, using = ".nav-menu-links__link div:nth-child(1)")
    public static WebElement sectionRegions;

    @FindBy(how = How.CSS, using = ".nav-menu-links div:nth-child(2)")
    public static WebElement sectionWorld;

    @FindBy(how = How.CSS, using = ".nav-menu-links div:nth-child(3)")
    public static WebElement sectionPolitics;

    @FindBy(how = How.CSS, using = ".nav-menu-links div:nth-child(4)")
    public static WebElement sectionOpinion;

    public static WebElement getSectionRegions() {
        return sectionRegions;
    }

    public static WebElement getsectionWorld() {
        return sectionWorld;
    }

    public static WebElement getsectionPolitics() {
        return sectionPolitics;
    }
    public static WebElement getsectionOpinion() {return sectionOpinion;}



    public  void goToSectionRegions(){
        getSectionRegions().click();
    }
    public  void goToSectionWorld(){
        getsectionWorld().click();
    }
    public  void goToSectionPolitics(){
        getsectionPolitics().click();
    }
    public  void goToSectionOpinion(){getsectionOpinion().click();}
}


