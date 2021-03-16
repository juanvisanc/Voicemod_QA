package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import configuration.TestSetConfig;
import pageobject.HomePage;
import pageobject.IosStorePage;
import pageobject.OurappsPage;

/**
 * 
 * @author Juan Fco. Sánchez
 *
 */
public class GoToIosStoreTest extends TestSetConfig{
	
	
	/**
	 * Test to go to android store
	 */
	@Test
	public void goToPlayStoreTest() {
		// Create a new instance of the HomePage with the Driver
		HomePage home = new HomePage(getDriver());
				
		// Use that instance to call the methods defined on the Home Page class. 
		home.navigateToVoicemodWeb();
		
		home.clickOnAcceptCookiesButton();
		
		Assert.assertTrue(home.checkVicemodLogoIsVisible(), "The Voicemod Logo is not displayed");
		Assert.assertTrue(home.checkForPcOptionIsVisible(), "The Voice changer for PC option is not displayed");
		Assert.assertTrue(home.checkSoundboardIsVisible(), "The Soundboard option is not displayed");
		Assert.assertTrue(home.checkVoicelabIsVisible(), "The Voicelab option is not displayed");
		Assert.assertTrue(home.checkFAQIsVisible(), "The FAQ option is not displayed");
		Assert.assertTrue(home.checkOurAppsIsVisible(), "The Our apps option is not displayed");
		Assert.assertTrue(home.checkBlogIsVisible(), "The Blog option is not displayed");
		Assert.assertTrue(home.checkEnglishLanguageIsVisible(), "The English language is not displayed");
		Assert.assertTrue(home.checkTitleIsVisible(), "The title is not displayed");
		Assert.assertTrue(home.checkSubtitleIsVisible(), "The subtitle is not displayed");
		Assert.assertTrue(home.checkButtonIsVisible(), "The button is not displayed");
		
		home.scrollToTheBottom();
		
		Assert.assertTrue(home.checkHeaderButtonIsVisible(), "The CrossBrowserTesting Logo is not displayed");
		Assert.assertTrue(home.checkPrivacityIsVisible(), "The Voicemod Logo is not displayed");
		Assert.assertTrue(home.checkCookiesIsVisible(), "The CrossBrowserTesting Logo is not displayed");
		
		home.scrollToTheTop();	
		
		home.waitCookiesClose();
		
		home.waitForOurAppsIsClickable();
		
		home.openOurApps();
		
		OurappsPage ourApps = new OurappsPage(getDriver());
		
		ourApps.waitTitleIsVisible();
		ourApps.waitText1IsVisible();
		ourApps.waitText2IsVisible();
		ourApps.waitAndroidIsVisible();
		ourApps.waitIosIsVisible();
		
		Assert.assertTrue(ourApps.checkTitleIsVisible(), "The title is not displayed");
		Assert.assertTrue(ourApps.checkText1IsVisible(), "The text 1 is not displayed");
		Assert.assertTrue(ourApps.checkText2IsVisible(), "The text 2 is not displayed");
		Assert.assertTrue(ourApps.checkAndroidIsVisible(), "The android store button is not displayed");
		Assert.assertTrue(ourApps.checkIosIsVisible(), "The iOS store button is not displayed");
		
		ourApps.clickOnIosStoreButton();
		
		IosStorePage iosStore = new IosStorePage(getDriver());
		
		//We only check if the app is Voicemod
		iosStore.waitVoicemodIosAppIsVisible();
		Assert.assertTrue(iosStore.checkVoicemodIosAppIsVisible(), "The app shown is not Voicemod");
		
	}

	
}
