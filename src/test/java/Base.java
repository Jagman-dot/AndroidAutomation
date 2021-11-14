import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class Base {

    public static void main(String[] args) {


    // app that we want to automate
    // apk file that we want to automate
    // device on which we want to automate
    // port 4723 is the port APPium server is listening

    File f = new File("/Users/jagmandeepdhaliwal/IdeaProjects/AndroidAutomation/API Demos for Android_v1.9.0_apkpure.com.apk");

    DesiredCapabilities cap = new DesiredCapabilities();

    cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel5");

    cap.setCapability(MobileCapabilityType.APP,);


    }

}
