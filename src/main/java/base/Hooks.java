package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.Before;

public class Hooks {
	public WebDriver driver = null;
	Properties p;

	@Before
	public WebDriver beforeSetup() {
		if (driver == null) {
			loadConfigProperties();
			getExecutionResultsBaseFolder();
			String browsername = p.getProperty("browser");
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir")+ "\\driver\\chromedriver.exe");
				this.driver = new ChromeDriver();
			}
			if (browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir")+ "\\driver\\geckodriver.exe");
				this.driver = new FirefoxDriver();

			}
			if (browsername.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir")+ "\\driver\\IEDriverServer.exe");
				this.driver = new InternetExplorerDriver();
			}
			DOMConfigurator.configure(System.getProperty("user.dir")+ "\\Config\\log4j.xml");
			driver.get(p.getProperty("Hosturl"));
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		return driver;

	}

	public void loadConfigProperties() {
		try {
			FileReader reader = new FileReader(System.getProperty("user.dir")+ "\\configs\\config.properties");
			p = new Properties();
			p.load(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void getExecutionResultsBaseFolder() {
		
			/*SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss");
			Date date = new Date();
			String returnDate = formatter.format(date);
			File file = new File(p.getProperty("ExecutionDirectory") + returnDate);
			file.mkdirs();
			Date ExecutionWatch = new Date();
			System.out.println(" Execution Endeded at time  :-" + ExecutionWatch);*/
		
	}

	public WebDriver setup(String browser) throws Exception {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;

	}
}
