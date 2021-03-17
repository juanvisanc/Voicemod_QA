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

	public boolean waitTitleIsVisible() {
		return waitForElementIsVisible(BlogConst.title);
	}
	public boolean checkTitleIsVisible() {
		return isElementVisible(BlogConst.title);
	}
	
	public boolean checkTEntry1IsVisible() {
		return isElementVisible(BlogConst.entry1);
	}
	
	public boolean checkTEntry3IsVisible() {
		return isElementVisible(BlogConst.entry3);
	}
	
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
