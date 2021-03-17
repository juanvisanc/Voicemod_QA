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
	
	
	public boolean waitVoicemodAndoridAppIsVisible() {
		return waitForElementIsVisible(AndroidStoreConst.app);
	}
	public boolean checkVoicemodAndoridAppIsVisible() {
		return isElementVisible(AndroidStoreConst.app);
	}
	
}
