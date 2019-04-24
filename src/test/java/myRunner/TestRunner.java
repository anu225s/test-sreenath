package myRunner;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.codehaus.plexus.util.FileUtils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
        features = ("D:\\TestGit\\BDD\\MavenProjectBDD\\src\\main\\resources\\features"),
        glue = {"stepdefination"},
        tags = {"@Important"},
       plugin = {"pretty","html:target/cucumber-reports/report", 
    		   "json:target/cucumber-reports/report.json",
    		   "com.cucumber.listener.ExtentCucumberFormatter:ExtentReport/ExtentreportHTML.html"
        		},
       monochrome = true,
       dryRun = false
		)

public class TestRunner  {
    private TestNGCucumberRunner testNGCucumberRunner;
 
    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
 
    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }
 
    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }
 
    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
    Reporter.loadXMLConfig(new File(System.getProperty("user.dir")+ "\\Config\\extent-config.xml"));
    Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
    Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
    Reporter.setSystemInfo("Machine", "Windows 10, " + "64 Bit");
    Reporter.setSystemInfo("Selenium", "3.11.0");
    Reporter.setSystemInfo("Maven", "3.5.2");
    Reporter.setSystemInfo("Java Version", "1.8.0_121");
    testNGCucumberRunner.finish();
    
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss");
  	Date date = new Date();
  	String returnDate = formatter.format(date);
  	File dest = new File("D:\\Execution_Result\\ExecutionResultsSummarycucumber" + returnDate);
  	dest.mkdirs();
      File source = new File(System.getProperty("user.dir")+ "\\ExtentReport");
      File source2 = new File(System.getProperty("user.dir")+ "\\target\\cucumber-reports");
            try {
          FileUtils.copyDirectory(source, dest);
          FileUtils.copyDirectory(source2, dest);
      } catch (IOException e) {
          e.printStackTrace();
      }
      File file = new File(System.getProperty("user.dir")+ "\\ExtentReport\\ExtentreportSmoke.html");
      File file1 = new File(System.getProperty("user.dir")+ "\\target\\cucumber-reports\\report1");
      File file2 = new File(System.getProperty("user.dir")+ "\\target\\cucumber-reports\\report1.json");
      file.delete();
      file1.delete();
      file2.delete();
      System.out.println("Execution Folder : " +dest);
      //
      }
     
     
}

