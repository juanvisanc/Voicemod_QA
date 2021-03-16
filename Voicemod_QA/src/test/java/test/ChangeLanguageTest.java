package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import configuration.TestSetConfig;
import pageobject.HomePage;


public class ChangeLanguageTest extends TestSetConfig{
	
	
	/**
	 * Test to change language 
	 */
	@Test
	public void changeLanguage() {
		
		
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
				home.waitLanguaje();
				home.viewLanguages();
				
				Assert.assertTrue(home.checkGermanLanguageIsVisible(), "The German language is not displayed");
				Assert.assertTrue(home.checkFrenchLanguageIsVisible(), "The French language is not displayed");
				Assert.assertTrue(home.checkJapaneseLanguageIsVisible(), "The Japanese language is not displayed");
				Assert.assertTrue(home.checkRussianLanguageIsVisible(), "The Russian language is not displayed");
				
				home.changeLanguage();
				
				Assert.assertTrue(home.checkGermanTitleIsVisible(), "The German title is not displayed");
				Assert.assertTrue(home.checkGermanSubtitleIsVisible(), "The German subtitle is not displayed");
								
			}
}
