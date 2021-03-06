package pageobject;

import org.openqa.selenium.WebDriver;

import configuration.BasePageObjectConfig;
import constant.SoundboardConst;

public class SoundboardPage extends BasePageObjectConfig{

	/**
	 * Class constructor.
	 * @param driver
	 */
	public SoundboardPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * Method to wait title
	 */
	public boolean waitTitleIsVisible() {
		return waitForElementIsVisible(SoundboardConst.title);
	}
	
	/**
	 * Check that the title is visible 
	 */
	public boolean checkTitleIsVisible() {
		return isElementVisible(SoundboardConst.title);
	}
	
	/**
	 * Method to wait text
	 */
	public boolean waitTextIsVisible() {
		return waitForElementIsVisible(SoundboardConst.text);
	}
	
	/**
	 * Check that the text is visible 
	 */
	public boolean checkTextIsVisible() {
		return isElementVisible(SoundboardConst.text);
	}
	
	/**
	 * Method to wait button
	 */
	public boolean waitButtonIsVisible() {
		return waitForElementIsVisible(SoundboardConst.button);
	}
	
	/**
	 * Check that the button is visible 
	 */
	public boolean checkButtonIsVisible() {
		return isElementVisible(SoundboardConst.button);
	}


	
	/**
	 * Method to click on the voicelab menu option
	 */
	public void clickOnvoicelabButton() {
		clickOnElement(SoundboardConst.voicelab);
	}
	
	/**
	 * Method to navigate to second section
	 */
	public void navigateSecondSection() {
		scrollToElement(SoundboardConst.title2);
	}
	
	/**
	 * Method to navigate to third section
	 */
	public void navigateThirdSection() {
		scrollToElement(SoundboardConst.title3);
	}
	
	/**
	 * Method to navigate to fourth section
	 */
	public void navigateFourthSection() {
		scrollToElement(SoundboardConst.title4);
	}
	
	/**
	 * Method to navigate to Fifth section
	 */
	public void navigateFifthSection() {
		scrollToElement(SoundboardConst.title5);
	}
	
	/**
	 * Method to navigate to top
	 */
	public void navigateTop() {
		scrollToTheTop();
	}
	
}
