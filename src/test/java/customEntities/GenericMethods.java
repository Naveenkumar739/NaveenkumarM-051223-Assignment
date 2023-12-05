package customEntities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Collections;

public class GenericMethods {
    public WebDriver driver;

public void Lauanch_Browser(String baseURL){
    ChromeOptions options = new ChromeOptions();
//        options.addArguments("--incognito");
//        options.addArguments("--start -maximized");
//        options.setHeadless(true);
    options.setExperimentalOption("prefs", Collections.singletonMap("plugins.always_open_pdf_externally", true));
//    capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//    options.setCapability("disable-popup-blocking",true);
    driver=new ChromeDriver(ChromeDriverService.createDefaultService(),options);
    driver.manage().window().maximize();
   driver.get(baseURL);
}
public void clickingonWebelemnt(WebElement elemnt,long waitTimeSeconds){
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(waitTimeSeconds)) ;
    WebElement elements=null;
    elements=wait.until(ExpectedConditions.elementToBeClickable(elements));
    elements.click();
}
public void sendkeysWebelemnt(WebElement elemnt,String text){
    waitforeachelemnt(elemnt,20);
    elemnt.click();
    elemnt.clear();
    elemnt.sendKeys(text);
}

public WebElement waitforeachelemnt(WebElement element, long waitTimesecond){
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(waitTimesecond));
    WebElement elements=wait.until(ExpectedConditions.elementToBeClickable(element));
    return element;
}


}
