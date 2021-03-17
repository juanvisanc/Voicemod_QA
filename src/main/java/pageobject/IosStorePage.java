package pageobject;

import org.openqa.selenium.WebDriver;

import configuration.BasePageObjectConfig;
import constant.IosStoreConst;

public class IosStorePage extends BasePageObjectConfig{

	/**
	 * Class constructor.
	 * @param driver
	 */
	public IosStorePage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * Method to wait ios app
	 */
	public boolean waitVoicemodIosAppIsVisible() {
		return waitForElementIsVisible(IosStoreConst.app);
	}
	
	/**
	 * Check that the ios app is visible 
	 */
	public boolean checkVoicemodIosAppIsVisible() {
		return isElementVisible(IosStoreConst.app);
	}
	
}
