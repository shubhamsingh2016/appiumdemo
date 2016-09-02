package appiumin;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class desiredcapab {
	

	@Test
	public void test() throws MalformedURLException {
		//fail("Not yet implemented");
		File appDir = new File("src");
		
		File app = new File(appDir, "bookMyShow-ucb.apk"); 
		
		DesiredCapabilities cap = new  DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android_Emulator");
		
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Android");
		cap.setCapability(MobileCapabilityType.VERSION, "4.4.3");
		//cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		//Android Driver
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);		
		driver.findElementById("com.bt.bms:id/btnLogin").click();
		driver.findElementById("com.bt.bms:id/btnSignUp").click();	
		int s = driver.findElements(By.className("android.widget.EditText")).size();
		System.out.println(s);
		List<WebElement> a = driver.findElements(By.className("android.widget.EditText"));
		a.get(0).sendKeys("Appium");
		a.get(1).sendKeys("Mobile");
		a.get(2).sendKeys("test.varshylmobile@gmail.com");
		a.get(3).sendKeys("pass123");
		driver.findElementById("com.bt.bms:id/action_icon").click();
		//cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "bookMyShow-ucb");
		
		//driver.findElement(By.id("com.bt.bms:id/btnLogin")).click();
		//driver.findElementById("com.bt.bms:id/btnLogin").click();
		
		//test info
		//Test
	}
	
	
	
	
		//
		//MobileElement e = (MobileElement) driver.findElementsById("com.varshylmobile.snaphomework:id/login");
	//	e.click();
		//MobileElement e = (MobileElement) driver.findElementByAndroidUIAutomator("com.varshylmobile.snaphomework:id/login").click();
		
		
		//driver.findElementById("com.varshylmobile.snaphomework:id/register").click();
		//driver.findElementById("com.varshylmobile.snaphomework:id/email").click();
		//driver.findElementById("com.varshylmobile.snaphomework:id/password").click();
		//driver.findElementById("com.varshylmobile.snaphomework:id/login").click();
		
		
		
}


