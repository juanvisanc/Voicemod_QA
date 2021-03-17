package pageobject;

import org.openqa.selenium.WebDriver;

import configuration.BasePageObjectConfig;
import constant.VoicelabConst;

public class VoicelabPage extends BasePageObjectConfig{

	/**
	 * Class constructor.
	 * @param driver
	 */
	public VoicelabPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * Method to wait title
	 */
	public boolean waitTitleIsVisible() {
		return waitForElementIsVisible(VoicelabConst.title);
	}
	
	/**
	 * Check that the title is visible 
	 */
	public boolean checkTitleIsVisible() {
		return isElementVisible(VoicelabConst.title);
	}
	
	/**
	 * Method to wait text1
	 */
	public boolean waitTextIsVisible() {
		return waitForElementIsVisible(VoicelabConst.text);
	}
	
	/**
	 * Check that the text1 is visible 
	 */
	public boolean checkTextIsVisible() {
		return isElementVisible(VoicelabConst.text);
	}
	
	/**
	 * Method to wait button
	 */
	public boolean waitButtonIsVisible() {
		return waitForElementIsVisible(VoicelabConst.button);
	}
	
	/**
	 * Check that the button is visible 
	 */
	public boolean checkButtonIsVisible() {
		return isElementVisible(VoicelabConst.button);
	}


	
	/**
	 * Method to click on the voicelab menu option
	 */
	public void clickOnBlogButton() {
		clickOnElement(VoicelabConst.blog);
	}
	
	/**
	 * Method to navigate to second section
	 */
	public void navigateSecondSection() {
		scrollToElement(VoicelabConst.title2);
	}
	
	/**
	 * Method to navigate to third section
	 */
	public void navigateThirdSection() {
		scrollToElement(VoicelabConst.title3);
	}
	
	/**
	 * Method to navigate to fourth section
	 */
	public void navigateFourthSection() {
		scrollToElement(VoicelabConst.title4);
	}
	
	/**
	 * Method to navigate to Fifth section
	 */
	public void navigateFifthSection() {
		scrollToElement(VoicelabConst.title5);
	}
	
	/**
	 * Method to navigate to sixth section
	 */
	public void navigateSixthSection() {
		scrollToElement(VoicelabConst.title6);
	}
	
	/**
	 * Method to navigate to seventh section
	 */
	public void navigateSeventhSection() {
		scrollToElement(VoicelabConst.title7);
	}
	
	/**
	 * Method to navigate to top
	 */
	public void navigateTop() {
		scrollToTheTop();
	}
	
}
