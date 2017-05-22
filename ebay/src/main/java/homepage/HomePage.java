package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Md.Golam Robbani on 5/21/2017.
 */
public class HomePage extends CommonAPI {

    @FindBy(how = How.CSS, using = "#w0-container li:nth-child(1)")
    public static WebElement sectionHome;

    @FindBy(how = How.CSS, using = "#w0-container li:nth-child(2)")
    public static WebElement sectionFollowing;

    @FindBy(how = How.CSS, using = "#w0-container li:nth-child(3)")
    public static WebElement sectionMotors;

    @FindBy(how = How.CSS, using = "#w0-container li:nth-child(4)")
    public static WebElement sectionFashion;

    @FindBy(how = How.CSS, using = ".hl-cat-nav__js-tab")
    public static WebElement sectionElectronics;

    @FindBy(how = How.CSS, using = ".hl-cat-nav__js-tab")
    public static WebElement sectionCollectibles;

    @FindBy(how = How.CSS, using = ".hl-cat-nav__js-tab")
    public static WebElement sectionHomeAndGarden;

    @FindBy(how = How.CSS, using = ".hl-cat-nav__js-tab")
    public static WebElement sectionSportingGoods;

    @FindBy(how = How.CSS, using = ".hl-cat-nav__js-tab")
    public static WebElement sectionToys;

    @FindBy(how = How.CSS, using = ".hl-cat-nav__js-tab")
    public static WebElement sectionBusinessAndIndustrial;

    @FindBy(how = How.CSS, using = ".hl-cat-nav__js-tab")
    public static WebElement sectionMusic;

    @FindBy(how = How.CSS, using = ".hl-cat-nav__js-tab")
    public static WebElement sectionDeals;

    @FindBy(how = How.CSS, using = ".gh-p")
    public static WebElement sectionDailyDeals;

    @FindBy(how = How.CSS, using = ".gh-p")
    public static WebElement sectionGiftCards;

    @FindBy(how = How.CSS, using = ".gh-p")
    public static WebElement sectionHelpAndContact;

    @FindBy(how = How.CSS, using = ".gh-p")
    public static WebElement sectionSell;

    @FindBy(how = How.CSS, using = ".gh-eb-li-a")
    public static WebElement sectionMyeBay;

    @FindBy(how = How.CSS, using = "#gh-as-a")
    public static WebElement sectionAdvanced;

    @FindBy(how = How.CSS, using = "#gh-cat-box")
    public static WebElement sectionAllCategories;

    public static WebElement getSectionHome() {
        return sectionHome;
    }
    public static WebElement getSectionFollowing() {
        return sectionFollowing;
    }
    public static WebElement getSectionMotors() {
        return sectionMotors;
    }
    public static WebElement getSectionFashion() {
        return sectionFashion;
    }
    public static WebElement getSectionElectronics() {
        return sectionElectronics;
    }
    public static WebElement getSectionCollectibles() {return sectionCollectibles;}
    public static WebElement getSectionHomeAndGarden() {return sectionHomeAndGarden;}
    public static WebElement getSectionSportingGoods() {return sectionSportingGoods;}
    public static WebElement getSectionToys() {return sectionToys;}
    public static WebElement getSectionBusinessAndIndustrial() {return sectionBusinessAndIndustrial;}
    public static WebElement getSectionMusic() {return sectionMusic;}
    public static WebElement getSectionDeals() {return sectionDeals;}
    public static WebElement getSectionDailyDeals() {return sectionDailyDeals;}
    public static WebElement getSectionGiftCards() {return sectionGiftCards;}
    public static WebElement getSectionHelpAndContact() {return sectionHelpAndContact;}
    public static WebElement getSectionSell() {return sectionSell;}
    public static WebElement getSectionMyeBay() {return sectionMyeBay;}
    public static WebElement getSectionAdvanced() {return sectionAdvanced;}
    public static WebElement getSectionAllCategories() {return sectionAllCategories;}

    public  void goToSectionHome(){getSectionHome().click();}
    public  void goToSectionFollowing(){getSectionFollowing().click();}
    public  void goToSectionMotors(){getSectionMotors().click();}
    public  void goToSectionFashion(){getSectionFashion().click();}
    public  void goToSectionElectronics(){getSectionElectronics().click();}
    public  void goToSectionCollectibles(){getSectionCollectibles().click();}
    public  void goToSectionHomeAndGarden(){getSectionHomeAndGarden().click();}
    public  void goToSectionSportingGoods(){getSectionSportingGoods().click();}
    public  void goToSectionToys(){getSectionToys().click();}
    public  void goToSectionBusinessAndIndustrial(){getSectionBusinessAndIndustrial().click();}
    public  void goToSectionMusic(){getSectionMusic().click();}
    public  void goToSectionDeals(){getSectionDeals().click();}
    public  void goToSectionDailyDeals(){getSectionDailyDeals().click();}
    public  void goToSectionGiftCards(){getSectionGiftCards().click();}
    public  void goToSectionHelpAndContact(){getSectionHelpAndContact().click();}
    public  void goToSectionSell(){getSectionSell().click();}
    public  void goToSectionMyeBay(){getSectionMyeBay().click();}
    public  void goToSectionAdvanced(){getSectionAdvanced().click();}
    public  void goToSectionAllCategories(){getSectionAllCategories().click();}



}

