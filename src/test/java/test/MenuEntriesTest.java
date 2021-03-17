package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import configuration.TestSetConfig;
import pageobject.BlogPage;
import pageobject.ForPCPage;
import pageobject.HomePage;
import pageobject.OurappsPage;
import pageobject.SoundboardPage;
import pageobject.VoicelabPage;

/**
 * 
 * @author Juan Fco. Sánchez
 *
 */
public class MenuEntriesTest extends TestSetConfig{
	
	
	/**
	 * Test to go to ios store
	 */
	@Test
	public void menuEntriesTest() {
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
		
		ourApps.navigateSecondSection();
		ourApps.navigateThirdSection();
		ourApps.navigateFourthSection();
		ourApps.navigateFifthSection();
		ourApps.navigateSixthSection();
		ourApps.navigateSeventhSection();
		ourApps.navigateTop();
		
		ourApps.clickOnForPCButton();
		
		ForPCPage forPc = new ForPCPage(getDriver());
		
		forPc.waitTitleIsVisible();
		forPc.waitTextIsVisible();
		forPc.waitButtonIsVisible();
		
		Assert.assertTrue(forPc.checkTitleIsVisible(), "The title is not displayed");
		Assert.assertTrue(forPc.checkTextIsVisible(), "The text is not displayed");
		Assert.assertTrue(forPc.checkButtonIsVisible(), "The button is not displayed");
		
		forPc.navigateSecondSection();
		forPc.navigateThirdSection();
		forPc.navigateFourthSection();
		forPc.navigateFifthSection();
		forPc.navigateSixthSection();
		forPc.navigateTop();
		
		forPc.clickOnSoundboardButton();
		
		SoundboardPage soundboard = new SoundboardPage(getDriver());
		
		soundboard.waitTitleIsVisible();
		soundboard.waitTextIsVisible();
		soundboard.waitButtonIsVisible();
		
		Assert.assertTrue(soundboard.checkTitleIsVisible(), "The title is not displayed");
		Assert.assertTrue(soundboard.checkTextIsVisible(), "The text is not displayed");
		Assert.assertTrue(soundboard.checkButtonIsVisible(), "The button is not displayed");
		
		soundboard.navigateSecondSection();
		soundboard.navigateThirdSection();
		soundboard.navigateFourthSection();
		soundboard.navigateFifthSection();

		soundboard.navigateTop();
		
		soundboard.clickOnvoicelabButton();
		
		VoicelabPage voicelab = new VoicelabPage(getDriver());
		
		voicelab.waitTitleIsVisible();
		voicelab.waitTextIsVisible();
		voicelab.waitButtonIsVisible();
		
		Assert.assertTrue(voicelab.checkTitleIsVisible(), "The title is not displayed");
		Assert.assertTrue(voicelab.checkTextIsVisible(), "The text is not displayed");
		Assert.assertTrue(voicelab.checkButtonIsVisible(), "The button is not displayed");
		
		voicelab.navigateSecondSection();
		voicelab.navigateThirdSection();
		voicelab.navigateFourthSection();
		voicelab.navigateFifthSection();
		voicelab.navigateSixthSection();
		voicelab.navigateSeventhSection();

		voicelab.navigateTop();
		
		voicelab.clickOnBlogButton();
		
		BlogPage blog = new BlogPage(getDriver());
		
		blog.waitTitleIsVisible();
		
		Assert.assertTrue(blog.checkTitleIsVisible(), "The title is not displayed");
		
		blog.navigateSecondEntry();
		Assert.assertTrue(blog.checkTEntry1IsVisible(), "The entry1 is not displayed");
		blog.navigateFourthEntry();
		Assert.assertTrue(blog.checkTEntry3IsVisible(), "The entry3 is not displayed");
		blog.checkTEntry5IsVisible();
		Assert.assertTrue(blog.checkTEntry5IsVisible(), "The entry5 is not displayed");
		
		blog.navigateTop();
		
		
	}

	
}
