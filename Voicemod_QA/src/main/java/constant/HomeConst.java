package constant;

import org.openqa.selenium.By;

public class HomeConst {
	
	
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
	public static final By germanLanguage = By.xpath("//span[contains(text(),'Deutsch')]");
	public static final By frenchLanguage = By.xpath("//span[contains(text(),'Français')]");
	public static final By japaneseLanguage = By.xpath("//span[contains(text(),'日本語')]");
	public static final By russianLanguage = By.xpath("//span[contains(text(),'Русский')]");
	public static final By headerButton = By.xpath("//header/div[1]/div[1]/div[3]/a[1]");
	public static final By cookiesButton = By.id("onetrust-accept-btn-handler");
	
	/*--------------------------------------------------------------------*
	|      BODY                                            
	*---------------------------------------------------------------------*/
	public static final By title = By.xpath("//h1[contains(text(),'FREE REAL-TIME VOICE CHANGER')]");
	public static final By subtitle = By.className("subtitle");
	public static final By button = By.linkText("GET VOICEMOD FREE");

	public static final By germanTitle = By.xpath("//h1[contains(text(),'GRATIS Echtzeit-Stimmenverzerrer für Online-Spiele')]");
	public static final By germanSubtitle = By.xpath("//p[contains(text(),'Voicemod funktioniert mit VRChat, Discord, Overwat')]");

	/*--------------------------------------------------------------------*
	|      FOOTER ELEMENTS                                            
	*---------------------------------------------------------------------*/ 
	public static final By privacity = By.xpath("//a[contains(text(),'Privacy Policy')]");
	public static final By cookies = By.xpath("//a[contains(text(),'Cookies Policy')]");

}
