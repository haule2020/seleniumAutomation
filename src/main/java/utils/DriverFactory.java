package utils;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

	private static WebDriver driver;

	public static WebDriver getChromeDriver() {
		if (driver == null) {
//			options
			ChromeOptions options = new ChromeOptions();
			//options.addArguments("--headless=new");
			options.addArguments("window-size=1920x1080");
			options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/143.0.0.0 Safari/537.36");

//		Set download folder
			Map<String, Object> prefs = new HashMap<>();
			prefs.put("download.default_directory", "C:\\Users\\truon\\Seleniumdowloads");
			options.setExperimentalOption("prefs", prefs);

			driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		}

		return driver;

	}

	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
