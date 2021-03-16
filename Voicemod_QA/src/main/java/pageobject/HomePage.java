package pageobject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import configuration.BasePageObjectConfig;
import constant.HomeConst;

public class HomePage extends BasePageObjectConfig{
	
	private static final Logger LOGGER = LogManager.getLogger(HomePage.class);

	/**
	 * Class constructor.
	 * @param driver
	 */
	public HomePage(WebDriver driver) {
		super(driver);
	}

	
	/*--------------------------------------------------------------------*
	|      NAVIGATION METHODS                                      
	*---------------------------------------------------------------------*/
	
	/**
	 * Navigate to the Selenium web
	 */
	public void navigateToVoicemodWeb() {
		navigateTo("https://www.voicemod.net");
	}
	
	/*--------------------------------------------------------------------*
	|      CHECK METHODS                                    
	*---------------------------------------------------------------------*/
	
	/*-----------------------------HEADER---------------------------------*/
	
	/**
	 * Check that the voicemod Logo is visible. 
	 */
	public boolean checkVicemodLogoIsVisible() {
		return isElementVisible(HomeConst.voicemodLogo);
	}
	
	/*---------------------------MENU LIST--------------------------------*/
	
	/**
	 * Check that the menu entries are visible 
	 */
	public boolean checkForPcOptionIsVisible() {
		return isElementVisible(HomeConst.forPc);
	}
	
	public boolean checkSoundboardIsVisible() {
		return isElementVisible(HomeConst.soundboard);
	}
	
	public boolean checkVoicelabIsVisible() {
		return isElementVisible(HomeConst.voicelab);
	}

	public boolean checkFAQIsVisible() {
		return isElementVisible(HomeConst.FAQ);
	}
	
	public boolean checkOurAppsIsVisible() {
		return isElementVisible(HomeConst.ourApps);
	}
	
	public boolean checkBlogIsVisible() {
		return isElementVisible(HomeConst.blog);
	}

	public boolean checkEnglishLanguageIsVisible() {
		return isElementVisible(HomeConst.englishLanguage);
	}
	
	public boolean checkGermanLanguageIsVisible() {
		return isElementVisible(HomeConst.germanLanguage);
	}
	
	public boolean checkFrenchLanguageIsVisible() {
		return isElementVisible(HomeConst.frenchLanguage);
	}
	
	public boolean checkJapaneseLanguageIsVisible() {
		return isElementVisible(HomeConst.japaneseLanguage);
	}
	
	public boolean checkRussianLanguageIsVisible() {
		return isElementVisible(HomeConst.russianLanguage);
	}
	
	public boolean checkTitleIsVisible() {
		return isElementVisible(HomeConst.title);
	}
	
	public boolean checkSubtitleIsVisible() {
		return isElementVisible(HomeConst.subtitle);
	}
	
	public boolean checkButtonIsVisible() {
		return isElementVisible(HomeConst.button);
	}
	
	public boolean checkHeaderButtonIsVisible() {
		return isElementVisible(HomeConst.headerButton);
	}
	
	public boolean checkGermanTitleIsVisible() {
		return isElementVisible(HomeConst.germanTitle);
	}
	
	public boolean checkGermanSubtitleIsVisible() {
		return isElementVisible(HomeConst.germanSubtitle);
	}
	/*---------------------------FOOTER--------------------------------*/
	
	public boolean checkPrivacityIsVisible() {
		return isElementVisible(HomeConst.privacity);
	}
	
	public boolean checkCookiesIsVisible() {
		return isElementVisible(HomeConst.cookies);
	}
	
	
	
	/*--------------------------------------------------------------------*
	|      ACTIONS METHODS                                         
	*---------------------------------------------------------------------*/
	
	/**
	 * Method to check button is clickable
	 */
	public void checkDownloadButtonIsClickable() {
		waitForElementIsEnabledAndClickable(HomeConst.button);
	}
	
	/**
	 * Method to click on the accept cookies
	 */
	
	public void clickOnAcceptCookiesButton() {
		if(waitForElementIsVisible(HomeConst.cookiesButton)) { 
			clickOnElement(HomeConst.cookiesButton);
		}
		else {
			LOGGER.info("[INFO] - The button cookies doesn't appear");
		}
	}
	
	/**
	 * Method to wait cookies close
	 */
	public void waitCookiesClose() {
		waitForElementIsNotVisible(HomeConst.cookiesButton);
	}
	
	/**
	 * Method to wait languages
	 */
	public void waitLanguaje() {
		waitForElementIsEnabledAndClickable(HomeConst.englishLanguage);
	}
	
	
	/**
	 * Method to view languages
	 */
	public void viewLanguages() {
		clickOnElement(HomeConst.englishLanguage);
	}
	
	/**
	 * Method to change language
	 */
	public void changeLanguage() {
		clickOnElement(HomeConst.germanLanguage);
	}
	
	/**
	 * Method to wait to Our app is clickable
	 */
	public void waitForOurAppsIsClickable() {
		waitForElementIsEnabledAndClickable(HomeConst.ourApps);
	}
	
	/**
	 * Method to open Our app options
	 */
	public void openOurApps() {
		clickOnElement(HomeConst.ourApps);
	}

}
