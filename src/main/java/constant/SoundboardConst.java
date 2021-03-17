package constant;

import org.openqa.selenium.By;

public class SoundboardConst {
	
	/*--------------------------------------------------------------------*
	|      HEADER AND MENU ELEMENTS                                            
	*---------------------------------------------------------------------*/
	public static final By voicemodLogo = By.id("logo");
	public static final By forPc = By.xpath("//a[@title='Voice Changer for PC']");
	public static final By soundboard = By.xpath("//a[contains(text(),'Soundboard')]");
	public static final By voicelab = By.xpath("//a[contains(text(),'Voicelab')]");
	public static final By FAQ = By.xpath("//a[contains(text(),'FAQ')]");
	public static final By ourApps = By.xpath("//a[contains(text(),'Our Apps')]");
	public static final By blog = By.xpath("//a[contains(text(),'Blog')]");
	public static final By englishLanguage = By.xpath("//span[contains(text(),'English')]");
	
	/*--------------------------------------------------------------------*
	|      BODY                                            
	*---------------------------------------------------------------------*/
	public static final By title = By.xpath("//h1[contains(text(),'SOUNDBOARD FOR ONLINE GAMES AND CHAT')]");
	public static final By text = By.xpath("//p[contains(text(),'The Voicemod soundboard adds custom sound effects to tons of games')]");
	public static final By button = By.className("download-button");
	
	public static final By title2 = By.xpath("//h2[contains(text(),'EXPLORE THE BEST FREE SOUNDBOARD FOR WINDOWS')]");
	public static final By title3 = By.xpath("//h3[contains(text(),'HOW TO SET UP THE VOICEMOD SOUNDBOARD')]");
	public static final By title4 = By.xpath("//h3[contains(text(),'LEVEL UP YOUR ROLEPLAY')]");
	public static final By title5 = By.xpath("//h3[contains(text(),'How to use Voicemod Voice Changer on other games &')]");


}
