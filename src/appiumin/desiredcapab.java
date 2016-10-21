package appiumin;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class desiredcapab {
	

	@Test
	public void test() throws MalformedURLException, InterruptedException {
		//fail("Not yet implemented");
		File appDir = new File("src");
		
		File app = new File(appDir, "com.mobeta.android.demodslv.apk"); 
		
		DesiredCapabilities cap = new  DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Android");
		cap.setCapability(MobileCapabilityType.VERSION, "4.4.3");
		//cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		//Android Driver
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		//Tap on Basic usage Playground.
		driver.findElementByName("Basic usage playground").click();
		//Locate 3rd element(Chick Corea) from list to drag.
		
		WebElement ele1 = (WebElement) driver.findElementsById("com.mobeta.android.demodslv:id/drag_handle").get(1);
		//Locate 6th element to drop dragged element.
		WebElement ele2 = (WebElement) driver.findElementsById("com.mobeta.android.demodslv:id/drag_handle").get(2);
		
		//Perform drag and drop operation using TouchAction class.
		  //Created object of TouchAction class.
		  TouchAction action = new TouchAction((MobileDriver) driver);
		  
		  System.out.println("It Is dragging element.");
		  //It will hold tap on 3rd element and move to 6th position and then release tap.
		  action.longPress(ele1).moveTo(ele2).release().perform();  
		  System.out.println("Element has been droped at destination successfully.");
		
		/*
		System.out.println(driver.isLocked());//LOcked condition
		System.out.println(driver.getContext());
		List<WebElement> abc=driver.findElements(By.className("android.widget.TextView"));
		
		TouchAction t=new TouchAction(driver);
		t.tap(abc.get(2)).perform();*/
		//TouchAction t1=new TouchAction(driver).longPress(el);
		
		
		
		//driver.installApp("");
		driver.closeApp();
		
		//driver.currentActivity();
		//driver.context(name)
		//driver.zoom(el)
		
		
		
		/*
		driver.findElementById("com.bt.bms:id/btnNoThanks").click();
		driver.findElementById("com.bt.bms:id/dismiss").click();
		MobileElement abc=(MobileElement)driver.findElement(By.className("android.widget.CheckedTextView"));
		abc.swipe(SwipeElementDirection.UP, 6000);
	//	abc.tap(left, duration);
		abc.zoom();*/
		
		/*Api Demo navigate to Preference option on list
		
		 
		driver.scrollTo("Preference").click();
		List <WebElement> b = driver.findElements(By.id("android:id/text1"));
		System.out.println(b.get(8).getText());*/
		
		/*-------------------------------------------------------------------*/
		
		
		/*  For book my Show demo
		 * 
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
		driver.findElementById("com.bt.bms:id/action_icon").click();*/
		
	}
	
		
		
}


