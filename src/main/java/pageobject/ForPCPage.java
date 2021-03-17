package pageobject;

import org.openqa.selenium.WebDriver;

import configuration.BasePageObjectConfig;
import constant.ForPCConst;

public class ForPCPage extends BasePageObjectConfig{

	/**
	 * Class constructor.
	 * @param driver
	 */
	public ForPCPage(WebDriver driver) {
		super(driver);
	}

	public boolean waitTitleIsVisible() {
		return waitForElementIsVisible(ForPCConst.title);
	}
	public boolean checkTitleIsVisible() {
		return isElementVisible(ForPCConst.title);
	}
	public boolean waitTextIsVisible() {
		return waitForElementIsVisible(ForPCConst.text);
	}
	public boolean checkTextIsVisible() {
		return isElementVisible(ForPCConst.text);
	}
	public boolean waitButtonIsVisible() {
		return waitForElementIsVisible(ForPCConst.button);
	}
	public boolean checkButtonIsVisible() {
		return isElementVisible(ForPCConst.button);
	}


	
	/**
	 * Method to click on the Sounboard menu option
	 */
	public void clickOnSoundboardButton() {
		clickOnElement(ForPCConst.soundboard);
	}
	
	/**
	 * Method to navigate to second section
	 */
	public void navigateSecondSection() {
		scrollToElement(ForPCConst.title2);
	}
	
	/**
	 * Method to navigate to third section
	 */
	public void navigateThirdSection() {
		scrollToElement(ForPCConst.title3);
	}
	
	/**
	 * Method to navigate to fourth section
	 */
	public void navigateFourthSection() {
		scrollToElement(ForPCConst.title4);
	}
	
	/**
	 * Method to navigate to Fifth section
	 */
	public void navigateFifthSection() {
		scrollToElement(ForPCConst.title5);
	}
	
	/**
	 * Method to navigate to sixth section
	 */
	public void navigateSixthSection() {
		scrollToElement(ForPCConst.title6);
	}
	
	/**
	 * Method to navigate to top
	 */
	public void navigateTop() {
		scrollToTheTop();
	}
	
}
