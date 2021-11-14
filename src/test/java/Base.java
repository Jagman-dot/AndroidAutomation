import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import sun.security.krb5.internal.crypto.Des;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Base {

    public static void main(String[] args) throws MalformedURLException {


    // app that we want to automate
    // apk file that we want to automate
    // device on which we want to automate
    // port 4723 is the port APPium server is listening

        AndroidDriver<AndroidElement> driver;



        DesiredCapabilities cap= new DesiredCapabilities();

        File appDir = new File("src");

        File app = new File(appDir, "APIDemos.apk");

        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel5");



        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");//new step

        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);



        driver.closeApp();
    }

}
