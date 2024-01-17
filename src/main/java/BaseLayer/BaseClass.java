package BaseLayer;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static FileInputStream fis;
	public static WebDriver driver;
	public static Properties prop;
	public BaseClass() {
		File f = new File(System.getProperty("user.dir")+"\\src/main/java\\ConfigurationLayer\\conf.properties");
		try {
			 fis = new FileInputStream(f);
			 prop = new Properties();
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void initialization() {
		 driver = new ChromeDriver();
		String u = prop.getProperty("url");
		 driver.get(u);
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
}
