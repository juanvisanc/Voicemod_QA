package pageobject;

import org.openqa.selenium.WebDriver;

import configuration.BasePageObjectConfig;
import constant.OurappsConst;

public class OurappsPage extends BasePageObjectConfig{

	/**
	 * Class constructor.
	 * @param driver
	 */
	public OurappsPage(WebDriver driver) {
		super(driver);
	}

	public boolean waitTitleIsVisible() {
		return waitForElementIsVisible(OurappsConst.title);
	}
	public boolean checkTitleIsVisible() {
		return isElementVisible(OurappsConst.title);
	}
	public boolean waitText1IsVisible() {
		return waitForElementIsVisible(OurappsConst.text1);
	}
	public boolean checkText1IsVisible() {
		return isElementVisible(OurappsConst.text1);
	}
	public boolean waitText2IsVisible() {
		return waitForElementIsVisible(OurappsConst.text2);
	}
	public boolean checkText2IsVisible() {
		return isElementVisible(OurappsConst.text2);
	}
	public boolean waitIosIsVisible() {
		return waitForElementIsVisible(OurappsConst.ios);
	}
	public boolean checkIosIsVisible() {
		return isElementVisible(OurappsConst.ios);
	}
	public boolean waitAndroidIsVisible() {
		return waitForElementIsVisible(OurappsConst.android);
	}
	public boolean checkAndroidIsVisible() {
		return isElementVisible(OurappsConst.android);
	}

	

	/**
	 * Method to click on the android store button
	 */
	public void clickOnAndroidStoreButton() {
		clickOnElement(OurappsConst.android);
	}
	
	/**
	 * Method to click on the android store button
	 */
	public void clickOnIosStoreButton() {
		clickOnElement(OurappsConst.ios);
	}
	
	/**
	 * Method to click on the Voice Changer for PC menu option
	 */
	public void clickOnForPCButton() {
		clickOnElement(OurappsConst.forPc);
	}
	
	/**
	 * Method to navigate to second section
	 */
	public void navigateSecondSection() {
		scrollToElement(OurappsConst.title2);
	}
	
	/**
	 * Method to navigate to third section
	 */
	public void navigateThirdSection() {
		scrollToElement(OurappsConst.title3);
	}
	/**
	 * Method to navigate to fourth section
	 */
	public void navigateFourthSection() {
		scrollToElement(OurappsConst.title4);
	}
	/**
	 * Method to navigate to Fifth section
	 */
	public void navigateFifthSection() {
		scrollToElement(OurappsConst.title5);
	}
	/**
	 * Method to navigate to sixth section
	 */
	public void navigateSixthSection() {
		scrollToElement(OurappsConst.title6);
	}
	/**
	 * Method to navigate to seventh section
	 */
	public void navigateSeventhSection() {
		scrollToElement(OurappsConst.title7);
	}
	
	/**
	 * Method to sleep
	 */
	public void sleep() {
		sleep(2);
	}
	
	
	/**
	 * Method to navigate to top
	 */
	public void navigateTop() {
		scrollToTheTop();
	}
	
	
	
}
