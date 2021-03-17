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
	 * Navigate to the Voicemod web
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
	
	/**
	 * Check that the menu entries are visible 
	 */
	public boolean checkSoundboardIsVisible() {
		return isElementVisible(HomeConst.soundboard);
	}
	
	/**
	 * Check that the menu entries are visible 
	 */
	public boolean checkVoicelabIsVisible() {
		return isElementVisible(HomeConst.voicelab);
	}
	
	/**
	 * Check that the menu entries are visible 
	 */

	public boolean checkFAQIsVisible() {
		return isElementVisible(HomeConst.FAQ);
	}
	
	/**
	 * Check that the menu entries are visible 
	 */
	public boolean checkOurAppsIsVisible() {
		return isElementVisible(HomeConst.ourApps);
	}
	
	/**
	 * Check that the menu entries are visible 
	 */
	public boolean checkBlogIsVisible() {
		return isElementVisible(HomeConst.blog);
	}

	/**
	 * Check that the menu entries are visible 
	 */
	public boolean checkEnglishLanguageIsVisible() {
		return isElementVisible(HomeConst.englishLanguage);
	}
	
	/**
	 * Check that the menu entries are visible 
	 */
	public boolean checkGermanLanguageIsVisible() {
		return isElementVisible(HomeConst.germanLanguage);
	}
	
	/**
	 * Check that the menu entries are visible 
	 */
	public boolean checkFrenchLanguageIsVisible() {
		return isElementVisible(HomeConst.frenchLanguage);
	}
	
	
	/**
	 * Check that the menu entries are visible 
	 */
	public boolean checkJapaneseLanguageIsVisible() {
		return isElementVisible(HomeConst.japaneseLanguage);
	}
	
	/**
	 * Check that the menu entries are visible 
	 */
	public boolean checkRussianLanguageIsVisible() {
		return isElementVisible(HomeConst.russianLanguage);
	}
	
	/**
	 * Check that the title is visible 
	 */
	public boolean checkTitleIsVisible() {
		return isElementVisible(HomeConst.title);
	}
	
	/**
	 * Check that the subtitle is visible 
	 */
	public boolean checkSubtitleIsVisible() {
		return isElementVisible(HomeConst.subtitle);
	}
	
	/**
	 * Check that the button is visible 
	 */
	public boolean checkButtonIsVisible() {
		return isElementVisible(HomeConst.button);
	}
	
	/**
	 * Check that the header button is visible 
	 */
	public boolean checkHeaderButtonIsVisible() {
		return isElementVisible(HomeConst.headerButton);
	}
	
	/**
	 * Check that the  title german language is visible 
	 */
	public boolean checkGermanTitleIsVisible() {
		return isElementVisible(HomeConst.germanTitle);
	}
	
	/**
	 * Check that the  subtitle german language is visible 
	 */
	public boolean checkGermanSubtitleIsVisible() {
		return isElementVisible(HomeConst.germanSubtitle);
	}
	/*---------------------------FOOTER--------------------------------*/
	
	/**
	 * Check that the privacity is visible 
	 */
	public boolean checkPrivacityIsVisible() {
		return isElementVisible(HomeConst.privacity);
	}
	
	/**
	 * Check that the cookies is visible 
	 */
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
		waitForElementIsNotVisible(HomeConst.cookiesDiv);
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
