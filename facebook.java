package goo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
public class facebook {


    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
    	
        String baseUrl = "https://www.facebook.com";
        //String expectedTitle = "Facebook";
       // String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);      
        //WebElement textbox1 = driver.findElement(By.xpath("//div[@class='form_column']//input[@name='email']"));
        WebElement textbox1 = driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
        textbox1.sendKeys("piruji@cryptonet.top");
        
        
        //WebElement textbox2 = driver.findElement(By.xpath("//div[@class='form_column']//input[@type='password']"));
         WebElement textbox2 = driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
        textbox2.sendKeys("Abcd1234@");

        //WebElement button1 = driver.findElement(By.xpath("//div[@class='form_column']//input[@type='submit']"));
          WebElement button1 = driver.findElement(By.xpath("//input[@data-testid='royal_login_button']"));
        
        try{
            Thread.sleep(4000);
            }
            catch(Exception e){
            	System.out.println(e);
            }
//        button1.submit();
        button1.click();
        
       
//        if (actualTitle.contentEquals(expectedTitle)){
//            System.out.println("Test Passed!");
//        } else {
//            System.out.println("Test Failed");
//        }
       
        //close Fire fox
        driver.close();
       
    }

}
