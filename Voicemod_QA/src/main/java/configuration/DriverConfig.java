package configuration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverConfig {
	
	/** Logger class initialization. */
	private static final Logger LOGGER = LogManager.getLogger(DriverConfig.class);
	
	/** Private constructor not used. */
	private DriverConfig() {}
	
	/** Generic Driver to build the selected platform */
	protected static WebDriver driver = null;
	static String resourceFolder = "src/main/resources/drivers/linux";
	String log = "INFO";
	
	/**
	 * Method to build a new Selenium Driver instance 
	 * @return the instance of the Driver
	 */
	public static WebDriver buildInstance(){	
		
		try {

			LOGGER.info("[ Driver Configuration ] - Set Up the Driver intance");
			 	
				 System.setProperty("webdriver.gecko.driver", resourceFolder+"/geckodriver");    
				 driver = new FirefoxDriver();	

		} catch (NullPointerException ex) {
			/** The driver instance is null cause by any capability, check this */
			LOGGER.error("The driver is malformed", ex);
		} catch (Exception ex) {
			LOGGER.error("Unexpected problem", ex);
		}
		
		return driver;
	}

}
