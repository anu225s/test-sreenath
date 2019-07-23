package stepdefination;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base.Hooks;
import cucumber.api.java.en.Then;
import utility.ExternalData;
import utility.PageElement;
import utility.WaitType;

public class RegistrationTest{
	WebDriver driver;
	WebPage hooks;
	ExternalData data;
	private PageElement patientCatagoryDropDown;
	private PageElement nameTitleDropDown;
	private PageElement firstNameTextField;
	private PageElement lastNameTextField;
	private PageElement dobTextField;
	private PageElement ageTextField;
	private PageElement genderDropDown;
	private PageElement mrtlStatusDropDown;
	private PageElement religionDropDown;
	private PageElement languageDropDown;
	private PageElement relationDropDown;
	private PageElement patientIdentityDropDown;
	private PageElement patientIdentityProofTextField;
	private PageElement nationalityDropDown;
	private PageElement isMlcDropDown;
	private PageElement educationDropDown;
	private PageElement occupationDropDown;
	private PageElement bloodGroupDropDown;
	private PageElement citizenshipDropDown;
	private PageElement scProofDropDown;
	private PageElement address1TextField;
	private PageElement mobileNumberTextField;
	private PageElement countryCodeDropDown;
	private PageElement zipCodeTextField;
	private PageElement submitButton;
	

	public RegistrationTest(Hooks hook) {
		driver=hook.beforeSetup();
		hooks = new WebPage(driver);
		patientCatagoryDropDown = new PageElement(By.name("PATIENT_CAT"), "Search Exch Drop Down List", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 2);
		nameTitleDropDown = new PageElement(By.name("TITLE"), "Search Exch Drop Down List", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 1);
		firstNameTextField = new PageElement(By.name("PNT_NAME"), "Search Exch Drop Down List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 1);
		lastNameTextField = new PageElement(By.name("LAST_NAME"), "Search Exch Drop Down List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 1);
		dobTextField = new PageElement(By.name("DOB"), "Search Exch Drop Down List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 1);
		ageTextField = new PageElement(By.name("AGE"), "Search Exch Drop Down List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 1);
		genderDropDown = new PageElement(By.name("SEX"), "Search Exch Drop Down List", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 1);
		mrtlStatusDropDown = new PageElement(By.name("MTRL_STATUS"), "Search Exch Drop Down List", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 1);
		religionDropDown = new PageElement(By.name("RELIGION"), "Search Exch Drop Down List", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 1);
		languageDropDown = new PageElement(By.name("PLANGUAGE"), "Search Exch Drop Down List", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 1);
		relationDropDown = new PageElement(By.name("RELATION"), "Search Exch Drop Down List", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 1);
		patientIdentityDropDown = new PageElement(By.name("PAT_IDENTITY"), "Search Exch Drop Down List", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		patientIdentityProofTextField = new PageElement(By.name("PAT_IDENTITY_PROOF"), "Search Exch Drop Down List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nationalityDropDown = new PageElement(By.name("NATIONALITY"), "Search Exch Drop Down List", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isMlcDropDown = new PageElement(By.name("IS_MLC"), "Search Exch Drop Down List", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		educationDropDown = new PageElement(By.name("EDUCATION"), "Search Exch Drop Down List", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		occupationDropDown = new PageElement(By.name("OCCUPATION"), "Search Exch Drop Down List", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		bloodGroupDropDown = new PageElement(By.name("BLOOD_GRP_CODE"), "Search Exch Drop Down List", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		citizenshipDropDown = new PageElement(By.name("CITIZENSHIP"), "Search Exch Drop Down List", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		scProofDropDown = new PageElement(By.name("SC_PROOF"), "Search Exch Drop Down List", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		address1TextField = new PageElement(By.name("ADDRESS1"), "Search Exch Drop Down List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		mobileNumberTextField = new PageElement(By.name("MOBILE_NO"), "Search Exch Drop Down List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		countryCodeDropDown = new PageElement(By.name("COUNTRY_CODE"), "Search Exch Drop Down List", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		zipCodeTextField = new PageElement(By.name("ZIP"), "Search Exch Drop Down List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		submitButton = new PageElement(By.name("submit"), "Search Exch Drop Down List", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}
	/*@Before(order=1)
	public void beforeScenario(Scenario scenario){
		this.scenario = scenario;
		data = new ExternalData(scenario.getName());
	} */
	@Then("^fill the registration form \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void fill_the_registration_form(String firstname, String lastname, String dob, String age,String panNo, String address1, String mobileno, String zipcode) {
		hooks.selectValueFromList(patientCatagoryDropDown, "Self");
		hooks.selectValueFromList(nameTitleDropDown, "Mr.");
		hooks.clearAndSendKeys(firstNameTextField, firstname);
		hooks.clearAndSendKeys(lastNameTextField, lastname);
		hooks.clearAndSendKeys(dobTextField, dob);
		hooks.clearAndSendKeys(ageTextField, age);
		hooks.selectValueFromList(genderDropDown, "Male");
		hooks.selectValueFromList(mrtlStatusDropDown, "Single");
		hooks.selectValueFromList(religionDropDown, "Hindu");
		hooks.selectValueFromList(languageDropDown, "English");
		hooks.selectValueFromList(relationDropDown, "Brother");
		hooks.selectValueFromList(patientIdentityDropDown, "PAN Card");
		hooks.clearAndSendKeys(patientIdentityProofTextField, panNo);
		hooks.selectValueFromList(nationalityDropDown, "Indian");
		hooks.selectValueFromList(isMlcDropDown, "No");
		hooks.selectValueFromList(educationDropDown, "MCA");
		hooks.selectValueFromList(occupationDropDown, "Employee");
		hooks.selectValueFromList(bloodGroupDropDown, "A+");
		hooks.selectValueFromList(citizenshipDropDown, "Indian");
		hooks.selectValueFromList(scProofDropDown, "No");
		hooks.clearAndSendKeys(address1TextField, address1);
		hooks.clearAndSendKeys(mobileNumberTextField, mobileno);
		hooks.selectValueFromList(countryCodeDropDown, "India");
		hooks.clearAndSendKeys(zipCodeTextField, zipcode);
		hooks.click(submitButton);
		}
}
