package constant;

import org.openqa.selenium.By;

public class BlogConst {
	
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
	public static final By title = By.xpath("//h1[contains(text(),'Blog')]");
	
	
	public static final By entry1 = By.xpath("//body/section[2]/a[1]/img[1]");
	public static final By entry2 = By.xpath("//body/section[2]/a[2]/img[1]");
	public static final By entry3 = By.xpath("//body/section[2]/a[3]/img[1]");
	public static final By entry4 = By.xpath("//body/section[2]/a[4]/img[1]");
	public static final By entry5 = By.xpath("//body/section[2]/a[5]/img[1]");
	public static final By entry6 = By.xpath("//body/section[2]/a[6]/img[1]");
	
	public static final By title2 = By.xpath("//h3[contains(text(),'How to use Voicemod Voice Changer on other games &')]");

}
