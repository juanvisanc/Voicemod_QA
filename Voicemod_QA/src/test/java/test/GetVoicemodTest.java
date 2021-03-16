package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import configuration.TestSetConfig;
import pageobject.HomePage;

/**
 * 
 * @author Juan Fco. Sánchez
 *
 */

public class GetVoicemodTest extends TestSetConfig{
	
	/**
	 * Test to get Voicemod
	 */
	@Test
	public void testGetVoicemod() {
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
		
		// I do not download. I check that the button is clickable. 
		//I was doing this test in chrome that looks like new login pages
		home.checkDownloadButtonIsClickable();
		
		
	}
	
}
	
