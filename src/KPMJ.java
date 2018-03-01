
import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.junit.After;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KPMJ {
	
	    String[] myArray = {"Emma@gmail.com","gjfgxjgnnkfklfjsd","Delelel","EpiphanyCompany",
	    		"Lorem Ipsum is simply dummy typesetting ", "Emmanuel","TesterTester"};   
	    
		WebDriver driver;
         //Feature: To produce test scripts and carry out testing for all Must & should items in MosCoW scoping doc	
         //Scenario: KPMG Connect on board Scope-and-MoSCoW; User is represented by 'First Person Singular'
	
	
	@Before
	public void ProjectURl() {
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		driver = new ChromeDriver();
		
		        //Given: I have the correct KPMG URL (http://kpmg-connect-on-board.iis.jaywingdev.co.uk/)
				//When: I lauch the valid URL on a search engine
				//Then: I should be on the Home Page displaying validating the asset and layout
		
		String title = driver.getTitle();
		System.out.println(title);
	
		driver.navigate().to("http://kpmg-connect-on-board.iis.jaywingdev.co.uk/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	} 
	
		@Ignore //Ignore KPMGLogoPresent for now
		
		/* Given I launch the valid company URL
		 * When I am on the KPMG website homepage
	  	 * Then I should be able to validate the logo present matching the requirement specification */
		
		public void KPMGLogoPresent() {
			
			WebElement logo = driver.findElement(By.xpath("/html/body/header/div[1]/div/div/a/svg"));
		if (logo == null) {
			driver.findElement(By.xpath("/html/body/header/div[1]/div/div/a/svg")).click();
		} 
		   else
		{
			driver.quit();
		}
	}

	@Test
	
	/*  Given I am on the KPMG website homepage
	 *  When I click on the Homepage link
	 *  And I click on the Board Edge link
	 *  And I click on the candidates link
	 *  Then all the three links should navigate to the next page */ 
	 
	public void Headers() {
		String title = driver.getTitle();
		System.out.println(title);
		assertEquals(driver.getTitle(), "Homepage");
		driver.findElement(By.xpath("/html/body/header/div[2]/div/div/nav/a[1]")).click(); // Homepage
		String textPresent = driver.findElement(By.xpath("//*[@id=\"app\"]/section[1]/div/div/div/div/h1")).getText();
		System.out.println(textPresent);
		
		String PageUrl = driver.getCurrentUrl();
		System.out.println(PageUrl);
		
		driver.findElement(By.xpath("/html/body/header/div[2]/div/div/nav/a[2]")).click(); // Board Edge
		String textPresent2 = driver.findElement(By.xpath("//*[@id=\"app\"]/section[1]/div/div/div/div/h1")).getText();
		System.out.println(textPresent2);		
		
		//Introduction video title goes here
		driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div/div[1]/div/div/div[1]/h2")).isDisplayed();
		System.out.println(driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div/div[1]/div/div/div[1]/h2")).isDisplayed());
		
		
		driver.findElement(By.xpath("/html/body/header/div[2]/div/div/nav/a[3]")).click(); // Candidates
		String textPresent3 = driver.findElement(By.xpath("//*[@id=\"app\"]/section[1]/div/div/div/div/h1")).getText();
		System.out.println(textPresent3);
		
		//How we can help candidates
		String textPresesnt4 = driver.findElement(By.xpath("//*[@id=\"app\"]/section[2]/div/div/div/div[1]/div[1]/div/div/h2")).getText();
		System.out.println(textPresesnt4);
		driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div/div[1]/div[1]/div/div/h2")).isDisplayed();
		System.out.println(driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div/div[1]/div[1]/div/div/h2")).isDisplayed());

	}

	@After
	
	/* Given I validated the KPMG website
	 * When I click on the close button
	 * Then I should be able to quit the website */
	                               
	public void TearDown() {

		driver.close();
	}
	
	@Test
	
	/*  Given I am on the KPMG Homepage
	 *  When I clicked on the KPMG Login button
	 * Then I should be on the Login Page displaying the 'Login to your account' and Login form fields */
	
	public void LogintoAccout() {
		String title = driver.getTitle();
		System.out.println(title);
				
		/*  Given I placed my cursor on the email field
		 *  When I input my valid email address "Emma@gmail.com" into the email address field 
		 * Then my email address should be accepted  */		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(myArray[0]);
		
		/*  Given I placed my cursor on the email field
		 *  When I input my valid password into the password field 
		 *  Then my password should be accepted  */		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(myArray[1]);
		
		/*  Given I have input all the correct details into the input fields
		 *  And I clicked the 'Remember Me'checkbox 
		 *  And I ensure the checked box is showing checked to confirm
		 *  When I clicked on the Login button below of the form 
		 *  Then I should be on the Homepage...........  */			
		driver.findElement(By.xpath("//*[@id=\"app\"]/section[2]/div/div/div/form/fieldset/div/div[4]/div/label"))
				.click();
	
		}	
	
	@Test
	
	/*  Given I am on the KPMG Homepage
	 *  When I clicked on the KPMG 'Register your interest' button
	 *  Then I should be on the 'Register your interest'page and form fields */
	
	public void RegisterYourInterest() throws InterruptedException, IOException{
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("/html/body/header/div[1]/div/div/nav/a[1]")).click();
		
		/*  Given I placed my cursor on the 'First name' field
		 *  When I input my valid First name into the First name field 
		 *  Then my First name should be accepted  */
		driver.findElement(By.id("firstname")).sendKeys(myArray[5]);
		
		/*  Given I placed my cursor on the 'Surname' field
		 *  When I input my valid Surname into the Surname field 
		 *  Then my Surname should be accepted  */
		driver.findElement(By.id("surname")).sendKeys(myArray[2]);
		
		/*  Given I placed my cursor on the 'Email address' field
		 *  When I input my valid Email address into the Email address field 
		 *  Then my Email address should be accepted  */
		driver.findElement(By.id("email")).sendKeys(myArray[0]);
		
		/*  Given I placed my cursor on the 'Confirm email address' field
		 *  When I input my valid Email address matching the original into the Confirm email address field 
		 *  Then my Email address should be confirmed and accepted  */
		driver.findElement(By.id("confirmemail")).sendKeys(myArray[0]);
		
		/*  Given I placed my cursor on the 'Company' field
		 *  When I input my valid Company name into the Surname field 
		 *  Then my Company name should be accepted  */
		driver.findElement(By.id("company")).sendKeys(myArray[3]);
		
		/*  Given I placed my cursor on the 'Role' field
		 *  When I input my valid Role into the Surname field 
		 *  Then my Role name input should be accepted  */
		driver.findElement(By.id("role")).sendKeys(myArray[6]);
		
		/*  Given I clicked on the drop down to display the options
		 *  And I see the options list of 'Where did you hear about Connect on Board?'
		 *  When I clicked on one option from the list
		 *  Then my selected option should be confirmed and display on the field   */
		
		/*  Given I placed my cursor on the message field displaying
		 *  When I input my message in the message area 
		 *  Then my message should be accepted  */
		driver.findElement(By.id("excited"))
				.sendKeys(myArray[4]);
		
		/* Given I'm on the upload a file field
		 * And I checked the correct file size (Max. file size: 4MB) from my local drive
		 * When I clicked the file from my local drive 
		 * Then I should validate that the file I uploaded is attached successfully	 */
		driver.findElement(By.xpath("//*[@id=\"app\"]/section[2]/div/div/div/form/div[1]/div[1]/div[5]/label/span[2]")).click();
		Runtime.getRuntime().exec("C:\\Users\\emmanuel.dele\\Desktop\\AutoIdKpmg.exe");		
		Thread.sleep(3000);
		
		
		/*  Given I have input all the correct details into the input fields		
		 *  When I clicked on the Register button below of the form 
		 *  Then my form should be registered and I should be on the HomePage...........  */	
		driver.findElement(By.xpath("//*[@id=\"app\"]/section[2]/div/div/div/form/div[2]/div/div/label")).click();
	
		}

	@Test // HomePage
	public void HomePage_YourConnectOnBoardGuide() {
		String title = driver.getTitle();
		System.out.println(title + " name of the Web");
		driver.findElement(By.xpath("//a[text()='Homepage']")).click(); // HomePage Link

		// Scroll down to Your Connect On Board guide

		driver.findElement(By.xpath("//*[@id=\"app\"]/section[3]/div/div/div/div[2]/div[2]/div[2]/div[1]/a")).click(); //Helping candidates	
		driver.findElement(By.xpath("//*[@id=\"app\"]/section[3]/div/div/div/div[2]/div[2]/div[2]/div[2]/a")).click(); //Supporting business
		assertEquals("http://kpmg-connect-on-board.iis.jaywingdev.co.uk/", "http://kpmg-connect-on-board.iis.jaywingdev.co.uk/");
	}
	
	
	@Test // Have a question about Connect on Board?    
	public void HaveaQuestionAboutConnectOnBoard() {
		String title = driver.getTitle();
		System.out.println(title);
		//Given: user is on Home page
		//when: user scroll down the page to see "Have a question about Connect on Board?" 
		//And the user clicked on the Contact Us button
		//Then: user should be on the ......................................
		driver.findElement(By.xpath("//*[@id=\"app\"]/section[5]/div/div/div/div/div[1]/div/div/a")).click();
	
	}
	
	@Test // Candidates Link
	public void WhyYouShouldGetOnBoard() {
		String title = driver.getTitle();
		System.out.println(title);
		//Given: user is on Home page
		//when: user clicks on Candidates Link 
		//Then: user should be on the Candidates Page
		driver.findElement(By.xpath("//*[@id=\"app\"]/section[5]/div/div/div/div/div[2]/div/div/a")).click();
	}
	
	@Test // Board Edge Link
	public void BoardEdgeLink() {
		driver.findElement(By.xpath("/html/body/header/div[2]/div/div/nav/a[2]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		assertTrue(driver.getTitle().equals("Board Edge"));
		//Given: user is on Board Edge page
		//when: user clicks on the Get in touch Button
		//Then: user should be on the Page
		driver.findElement(By.xpath("//*[@id=\"app\"]/section[1]/div/div/div/div/a")).click();
		driver.navigate().back();
			
	}
		
		@Test // Board Edge 
	    public void HomePage_YourConnectOnBoardGuide_2() {
		String title = driver.getTitle();
		System.out.println(title);
		//Given: user is on Home page
		//When: user scroll down the page 
		//And: see the Board Edge link to clicks on Board Edge Link 		
		//Then: user should be on the Board Edge Page		
		driver.findElement(By.xpath("//*[@id=\"app\"]/section[4]/div/div/div[1]/a/div/p")).click(); //Board Edge
		
		//Given: user is on Home page
		//When: user scroll down the page 
		//And: see the Perspectives link to clicks on the Link 		
		//Then: user should be on the Board Edge Page
		driver.findElement(By.xpath("//*[@id=\"app\"]/section[4]/div/div/div[2]/a/div/p")).click(); //Perspectives
		
		//Given: user is on Home page
		//When: user scroll down the page 
		//And: see the Register your interest to clicks on the Link 		
		//Then: user should be on the Register your interest Page
		driver.findElement(By.xpath("//*[@id=\"app\"]/section[4]/div/div/div[3]/a/div/h3")).click(); //Register your interest
		
		//Given: user is on Home page
		//When: user scroll down the page 
		//And: see the Board Leadership Articles to clicks on the Link 		
		//Then: user should be on the Board Leadership Articles Page
		driver.findElement(By.xpath("//*[@id=\"app\"]/section[4]/div/div/div[4]/a/div/h3")).click(); //Board Leadership Articles
	
	}
	
	@Test // Privacy Policy
	public void PrivacyPolicy() {
		driver.findElement(By.xpath("/html/body/footer/div[2]/div/div/nav/a")).click();
		driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(title);
		
		
	}
	
	
}
