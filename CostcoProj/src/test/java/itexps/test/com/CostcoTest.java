/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package itexps.test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author 12244
 */
public class CostcoTest {
    private WebDriver driver;
  private String baseUrl;
    
    public CostcoTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
     System.setProperty("webdriver.chrome.driver","c:\\data\\chromedriver.exe"); 
         driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
   
    @Test
  public void testGoldStarMemberTest1() throws Exception {
    driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TcwskwzNlJgNGB0YPBiS84vLknOBwA9pQWy&q=costco&rlz=1C1CHZN_enUS958US960&oq=costco&aqs=chrome.1.0i271j46i67i131i199i433i465i650j69i64j0i20i131i263i433i512j0i131i433i457i512j69i60l3.6077j0j7&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/a/h3")).click();
    driver.get("https://www.costco.com/");
    driver.findElement(By.id("Home_Ancillary_9")).click();
    driver.findElement(By.linkText("Select Gold Star")).click(); 
    
    
  }  
  
}
