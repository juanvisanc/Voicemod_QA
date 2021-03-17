package constant;

import org.openqa.selenium.By;

public class OurappsConst {
	
	/*--------------------------------------------------------------------*
	|      HEADER AND MENU ELEMENTS                                            
	*---------------------------------------------------------------------*/
	public static final By voicemodLogo = By.id("logo");
	public static final By forPc = By.xpath("//a[@title='Voice Changer for PC']");
	public static final By soundboard = By.xpath("//a[contains(text(),'Soundboard')]");
	public static final By voicelab = By.xpath("//body/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/a[1]");
	public static final By FAQ = By.xpath("//a[contains(text(),'FAQ')]");
	public static final By ourApps = By.xpath("//a[contains(text(),'Our Apps')]");
	public static final By blog = By.xpath("//a[contains(text(),'Blog')]");
	public static final By englishLanguage = By.xpath("//span[contains(text(),'English')]");
	
	/*--------------------------------------------------------------------*
	|      BODY                                            
	*---------------------------------------------------------------------*/
	public static final By title = By.xpath("//h1[contains(text(),'Voicemod Clips - Android and iOS App')]");
	public static final By text1 = By.xpath("//p[contains(text(),'Use the power of Voicemod Voice Changer on your sm')]");
	public static final By text2 = By.xpath("//p[contains(text(),'Voicemod Clips is a mobile app that lets you creat')]");
	public static final By android = By.xpath("//body/section[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]");
	public static final By ios = By.xpath("//body/section[1]/div[1]/div[1]/div[1]/div[1]/a[2]/img[1]");
	
	public static final By title2 = By.xpath("//body/section[2]/div[1]/div[2]/h2[1]");
	public static final By title3 = By.xpath("//h3[contains(text(),'A voice changer for Tiktok, Instagram, Stories and')]");
	public static final By title4 = By.xpath("//h3[contains(text(),'Dozens of video filters and face masks for your vi')]");
	public static final By title5 = By.xpath("//h3[contains(text(),'Create original content and share it with anyone')]");
	public static final By title6 = By.xpath("//body/section[9]/div[1]/div[2]/h2[1]");
	public static final By title7 = By.xpath("//h2[contains(text(),'Download Voicemod Clips App for Android and iPhone')]");
	

}
