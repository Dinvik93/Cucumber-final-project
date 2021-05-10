package com.base_class;


	import java.awt.AWTException;

	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.io.IOException;
	import java.util.List;
	import java.util.Scanner;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebDriver.Timeouts;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	
	
	public class Base_Class {
	
		public static WebDriver driver;
	//webdriver	
		public static WebDriver browserlaunch(String browser) {
			
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else {
				System.out.println("invalid");
			}
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			return driver;
		}
		
		//geturl
		public static void launchUrl(String url) {
			driver.get(url);
		}
		
		//gettitle
		public static void title() {
			String title = driver.getTitle();
	System.out.println("Title = "+title);

		}
		
		//getcurrenturl
		public static void currenturl() {
			String currentUrl = driver.getCurrentUrl();
			System.out.println("CurrentUrl = "+currentUrl);
		}
		
		//gettext
		public static void gettext(WebElement element) {
			String text = element.getText();
	System.out.println("text = "+text);
		}
		
		//gettexts
			public static void gettexts(String xpath) {
				List<WebElement> elements = driver.findElements(By.xpath(xpath));
				System.out.println("ALL Texts are ");
				for (WebElement webElement : elements) {
					String text = webElement.getText();
					System.out.println(text);
				}
			}
				
		//getattribute
			public static void getattribute(String xpath, String attribute) {
				WebElement element = driver.findElement(By.xpath(xpath));
				String attributevalue = element.getAttribute(attribute);
				System.out.println(attributevalue);

			}
			
		//navigate forward
		public static void Forward() {
			driver.navigate().forward();
		}
		
		//navigate back
		public static void back() {
			driver.navigate().back();
		}
		
		//navigate refresh
			public static void refresh() {
				driver.navigate().refresh();
			}
			
			//navigate to
					public static void navTo(String url) {
						driver.navigate().to(url);
					}
			
	//click
		public static void clickon(WebElement element ) {
			element.click();
		}
		
		//sendkeys
	public static void sendkeys(WebElement element, String str) {
		element.sendKeys(str);
	}

	//findid with click
	public static void findId1(String str) {
	WebElement findElement = driver.findElement(By.id(str));
	findElement.click();
	}

	//findid with sendkeys
	public static void findId2(String str, String sendkeys) {
	WebElement findElement = driver.findElement(By.id(str));
	findElement.sendKeys(sendkeys);
	}

	//findname with click
	public static void findname1(String name) {
	WebElement findElement = driver.findElement(By.name(name));
	findElement.click();
	}

	//findname with sendkeys
	public static void findname2(String name, String sendkeys) {
	WebElement findElement = driver.findElement(By.name(name));
	findElement.sendKeys(sendkeys);
	}

	//findxpath with click
	public static void findXpath1(String xpath) {
	WebElement findElement = driver.findElement(By.xpath(xpath));
	findElement.click();
	}

	//findxpath with sendkeys
	public static void findXpath2(String xpath, String sendkeys) {
	WebElement findElement = driver.findElement(By.xpath(xpath));
	findElement.sendKeys(sendkeys);
	}

	//implicitwait
	public static void implicitwait(int a ) {
		 driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);
	}

	//explicitwait
	public static void explicitwait_withxpath(int a, String xpath ) {
		WebElement element = driver.findElement(By.xpath(xpath));
	WebDriverWait wait = new WebDriverWait(driver, a);
	wait.until(ExpectedConditions.visibilityOf(element));
	element.click();
	}


	//window handles with window stop
	public static void windowHandles(String titlecompare) {
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		for (String str : windowHandles) {
			String title = driver.switchTo().window(str).getTitle();
			System.out.println(title);
		}
	System.out.println("*************");

		for (String str1 : windowHandles) {
			
			if (driver.switchTo().window(str1).getTitle().equals(titlecompare)) {

				break;		
	}
		}
	}

	//actions click
	public static void mouseClick(String str) {
		Actions ac = new Actions(driver);
		
		WebElement findElement = driver.findElement(By.xpath(str));
		ac.click(findElement).build().perform();
	}

	//actions contextclick
	public static void mousecontextClick(String str) {
		Actions ac = new Actions(driver);
		
		WebElement findElement = driver.findElement(By.xpath(str));
		ac.contextClick(findElement).build().perform();
	}

	//actions moveto
	public static void mouseMoveTo(String str) {
		
		WebElement element = driver.findElement(By.xpath(str));
		Actions ac = new Actions(driver);
		
		ac.moveToElement(element).build().perform();
		
		

	}

	//robot down
	public static void robot_down() throws AWTException {
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	}

	//robot enter
	public static void robot_enter() throws AWTException {
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	}

	//robot up
	public static void robot_up() throws AWTException {
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_UP);
	r.keyRelease(KeyEvent.VK_UP);
	}
	
	public static void robot_backspace() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
		}

	//robotcontroltab

	public static void robot_ControlTab() throws AWTException {
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_CONTROL);
	}
	//scannerinput
	public static void scan() {
		
		Scanner sc = new Scanner(System.in);
	String nextLine = sc.nextLine();
	System.out.println("scan input= "+nextLine);
	}
	 
	//screenshot
	public static void screenshot(String desPath) throws IOException {

	TakesScreenshot ts = (TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File destination = new File(desPath);
	FileUtils.copyFile(source, destination);
	}

	//frame
	public static void frame(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		driver.switchTo().frame(element);

	}

	//singledropdowntext
	public static void singledropdowntext(WebElement element, String visibletext) {
		
		Select sc = new Select(element);
		List<WebElement> options = sc.getOptions();
	//	System.out.println("all available options are:");
//		for (WebElement webElement : options) {
//		String text = webElement.getText();
//		System.out.println(text);
		sc.selectByVisibleText(visibletext);
			
		//}
	}

	//singledropdownindex
		public static void singledropdownindex(String xpath, int i) {
			WebElement element = driver.findElement(By.xpath(xpath));
			Select sc = new Select(element);
			List<WebElement> options = sc.getOptions();
			System.out.println("all available options are:");
			for (WebElement webElement : options) {
			String text = webElement.getText();
			System.out.println(text);
			sc.selectByIndex(i);
				
			}
		
	}
		
		//singledropdownvalue
		public static void singledropdownvalue(String xpath, String i) {
			WebElement element = driver.findElement(By.xpath(xpath));
			Select sc = new Select(element);
			List<WebElement> options = sc.getOptions();
			System.out.println("all available options are:");
			for (WebElement webElement : options) {
			String text = webElement.getText();
			System.out.println(text);
			sc.selectByValue(i);
			}	
			}
		
		//multipledropdown
	public static void multipledropdown(String xpath, int a, int b, int c, int d) {
		WebElement multiple = driver.findElement(By.xpath(xpath));
		Select s = new Select(multiple);
		boolean multiple2 = s.isMultiple();
		System.out.println(multiple2);
		List<WebElement> options = s.getOptions();
		for (WebElement alloptions : options) {
			System.out.println(alloptions.getText());
		}
		System.out.println(options.size());
		
		for (int i = 0; i < options.size(); i++) {
			if (i==a || i==b || i==c ||i==d) {
				s.selectByIndex(i);
			}
		}
		System.out.println("*********");
	List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	for (WebElement selectedoptions : allSelectedOptions) {
		System.out.println(selectedoptions.getText());
	}
		
	WebElement firstSelectedOption = s.getFirstSelectedOption();	
		
		System.out.println(firstSelectedOption.getText());
		
		

	}

	//isEnabled
	public static void isEnabled(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
	 boolean enabled = element.isEnabled();
	System.out.println(enabled);
	}

	//isDisplaced
	public static void isDisplaced(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
	boolean displayed = element.isDisplayed();
	System.out.println(displayed);
	}

	//isSelected
	public static void isSelected(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
	 boolean selected = element.isSelected();
	System.out.println(selected);
	}

	//isMultiple
	public static void isMultiple(String xpath) {
		WebElement multiple = driver.findElement(By.xpath(xpath));
		Select s = new Select(multiple);
		boolean multiple2 = s.isMultiple();
		System.out.println("Is the given element is Multiple? "+multiple2);

	}

	//Alertaccept
	public static void alertaAccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

	//alertDismiss
	public static void alertDismiss() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();

	}


	}










