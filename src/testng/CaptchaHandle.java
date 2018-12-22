package testng;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CaptchaHandle {
	
	public WebDriver driver;
	
	@BeforeClass
	public void OpenUrl()
	{
		System.setProperty("webdriver.gecko.driver", "/Anand Data/library/geckodriver");   // set path of geckodriver
		driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.gecko.driver", "/Anand Data/library/geckodriver");   // set path of geckodriver
		//driver = new SafariDriver();
		driver.get("http://captchagame.com/");
		//driver.manage().window().maximize();
	}
	
@Test
	
	public void EnterCaptcha()
	{
	driver.switchTo().frame(0); //calling iframe with no id
	JavascriptExecutor js = (JavascriptExecutor) driver; 
	//Setting the captcha values 
	js.executeScript("document.getElementsByName('recaptcha_challenge_image')[0].setAttribute('value', '03AJz9lvQRjdOX4Zgp6RfEaUZ5pGIKzTenUJ6BQRaA47wbDUvcYIltmh667r26UoBxmjgQA_Wh07XaUqseKgVgf0aDeFeje_0jHt8a6BX1vPI7sXC0DRsMn6R__8V634jLWjn3S6h-NukoiUxMid11AoPb5Cb-KeMSBnQ35xblVhUIi8hbyu53OTfnV4ARGCfrfrPSN9Fg-UB4brkN1KK31VBOv4jX0wnWlQ&th=,0CFXIQCwXM-HuBzAWay2xFWMG_V5OOzwAAAAT6AAAADjawOLsjRvKDihTR8pmmFHT5IoTRFtjoKOSApBRZ6AkFu_hMYGznjjJw7yGacb7_M5kC4xh32lArV2V20KnXrKcfRn8FQChoLGW1iJUXx_P7JguSoky39Cx8H-GeSCP97oFsBk0MVseXPY8UovxeUUyswZorOeFRB985IZckfXbeoUYN2Jj2VdBzH-jNuh5zBLbA1bp8-0ZpWPRkWKOZFTSvXxPj4mK6MS36U4iNVX0o3OzfLjfkOvoUG2PjEJTTlx4vpoqXU6YN81VcJgZXxYs3ODCoVnTZZALpm6TxM3SlNEs23AaLJYXfPwOXVhvwIply7LTeIjQUPjWxlyGW9L9ICQFP16fBsemRfvZpzoJQnx9Sft4w9jcOkhg444CwYlcDYHWy5VW9lWAEotGJW4wwmn4Zg5-IXFbW3-BtE1EKycz5C1ZzLZnGet23wpt_rgu3_EPwXYPskDwWVgWYWI2VMBZp0Vt0zHLl1mxvDsdYm9roH_KK5dqvfg1VgBWWTF8uL3PHTEirgTh0qdLXmITmTANkClbURtys5SyWQYNmIXlOJivpJVR1W3Wb55469goV3NflOanYUj-RasnqC9B42oGl3jpMfpPubvup0yZRJBGH3iSPUf6yMxs5rTlUxacIFYDXX5CXrad3LFqxPzJ1xhokdi7I76F2DMQ2EFTHCawJvuEqvKj9aItYc44D')");
	driver.findElement(By.name("recaptcha_response_field")).sendKeys("23129555894");
	driver.findElement(By.name("Button1")).click();
	}


}
