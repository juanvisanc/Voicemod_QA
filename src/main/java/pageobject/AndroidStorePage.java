package pageobject;

import org.openqa.selenium.WebDriver;

import configuration.BasePageObjectConfig;
import constant.AndroidStoreConst;

public class AndroidStorePage extends BasePageObjectConfig{

	/**
	 * Class constructor.
	 * @param driver
	 */
	public AndroidStorePage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * Method to wait android app
	 */
	public boolean waitVoicemodAndoridAppIsVisible() {
		return waitForElementIsVisible(AndroidStoreConst.app);
	}
	
	/**
	 * Method to check android app is visible
	 */
	public boolean checkVoicemodAndoridAppIsVisible() {
		return isElementVisible(AndroidStoreConst.app);
	}
	
}
