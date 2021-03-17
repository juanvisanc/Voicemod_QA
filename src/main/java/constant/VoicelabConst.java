package constant;

import org.openqa.selenium.By;

public class VoicelabConst {
	
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
	public static final By title = By.xpath("//h1[contains(text(),'VOICE MAKER & EFFECTS GENERATOR')]");
	public static final By text = By.xpath("//p[contains(text(),'The Voicemod Voicelab lets you create custom voice')]");
	public static final By button = By.className("download-button");
	
	public static final By title2 = By.xpath("//h2[contains(text(),'GET CREATIVE WITH THE BEST VOICE GENERATOR')]");
	public static final By title3 = By.xpath("//h3[contains(text(),'HOW TO SET UP THE VOICEMOD VOICELAB')]");
	public static final By title4 = By.xpath("//h3[contains(text(),'ENDLESS CUSTOMIZATION')]");
	public static final By title5 = By.xpath("//h3[contains(text(),'USER-CREATED VOICE LIBRARY')]");
	public static final By title6 = By.xpath("//h3[contains(text(),'SHARE YOUR CREATIONS WITH THE COMMUNITY')]");
	public static final By title7 = By.xpath("//h2[contains(text(),'CHECK OUT THESE VOICELAB SAMPLES')]");
	public static final By title8 = By.xpath("//h3[contains(text(),'How to use Voicemod Voice Changer on other games &')]");
	

}
