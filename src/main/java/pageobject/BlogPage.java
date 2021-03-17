package pageobject;

import org.openqa.selenium.WebDriver;

import configuration.BasePageObjectConfig;
import constant.BlogConst;

public class BlogPage extends BasePageObjectConfig{

	/**
	 * Class constructor.
	 * @param driver
	 */
	public BlogPage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * Method to wait title
	 */
	public boolean waitTitleIsVisible() {
		return waitForElementIsVisible(BlogConst.title);
	}
	
	/**
	 * Method to check title is visible
	 */
	public boolean checkTitleIsVisible() {
		return isElementVisible(BlogConst.title);
	}
	
	/**
	 * Method to check entry1 is visible
	 */
	public boolean checkTEntry1IsVisible() {
		return isElementVisible(BlogConst.entry1);
	}
	
	/**
	 * Method to check entry3 is visible
	 */
	public boolean checkTEntry3IsVisible() {
		return isElementVisible(BlogConst.entry3);
	}
	
	/**
	 * Method to check entry5 is visible
	 */
	public boolean checkTEntry5IsVisible() {
		return isElementVisible(BlogConst.entry5);
	}

	
	/**
	 * Method to navigate to second entry
	 */
	public void navigateSecondEntry() {
		scrollToElement(BlogConst.entry2);
	}
	
	
	/**
	 * Method to navigate to fourth entry
	 */
	public void navigateFourthEntry() {
		scrollToElement(BlogConst.entry4);
	}
	
	
	/**
	 * Method to navigate to sixth entry
	 */
	public void navigateSixthEntry() {
		scrollToElement(BlogConst.entry6);
	}
	
	
	/**
	 * Method to navigate to top
	 */
	public void navigateTop() {
		scrollToTheTop();
	}
	
}
