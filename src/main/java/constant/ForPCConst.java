package constant;

import org.openqa.selenium.By;

public class ForPCConst {
	
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
	public static final By title = By.xpath("//h1[contains(text(),'VOICE CHANGER FOR GAMES AND CHAT')]");
	public static final By text = By.xpath("//p[contains(text(),'Voicemod is compatible with all your favorite games')]");
	public static final By button = By.className("download-button");
	
	public static final By title2 = By.xpath("//h2[contains(text(),'THE #1 VOICE CHANGING APP FOR WINDOWS')]");
	public static final By title3 = By.xpath("//h3[contains(text(),'HOW TO CHANGE YOUR VOICE: SET UP VOICEMOD VOICE CH')]");
	public static final By title4 = By.xpath("//h3[contains(text(),'EVER-GROWING LIBRARY OF VOICE FILTERS')]");
	public static final By title5 = By.xpath("//h3[contains(text(),'GET CREATIVE AND CUSTOMIZE')]");
	public static final By title6 = By.xpath("//h3[contains(text(),'How to use Voicemod Voice Changer on other games &')]");


}
