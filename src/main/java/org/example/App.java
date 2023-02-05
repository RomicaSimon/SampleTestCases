package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App
{
    //   Using Browser commands
    // 1. Open the Chrome browser
    // 2. Navigate to the Url: https://www.emag.ro/
    // 3. Maximize the window
    // 4. Verify the current Url of the page
    // 5. Verify the title of the page
    // 6. Print the length of the title of the page
    // 7. Print the page source of the page
    // 8. Click on new tab
    // 9. Close the browser
    // 10. Quit the browser
    public static void main( String[] args ) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://Users//ACER//Downloads//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.emag.ro/");
        driver.manage().window().maximize();
        String pageUrl = driver.getCurrentUrl();
        System.out.println("The current Url of the page is " + pageUrl);
        if (pageUrl.equals("https://www.emag.ro/")) {
            System.out.println("The page Url is correct");
        }
        else{
            System.out.println("The page Url is incorrect");
        }
        String pageTitle = driver.getTitle();
        System.out.println("The title of the page is  " + pageTitle);
        if (pageTitle.equals("eMAG.ro - Căutarea nu se oprește niciodată")) {
            System.out.println("The title of the page is correct");
        }
        else {
            System.out.println("The title of the page is incorrect");
        }
        int titleLength = driver.getTitle().length();
        System.out.println("The length of the title is " + titleLength);
        //String pageSource = driver.getPageSource();
        //System.out.println("The page source is " + pageSource);
        driver.findElement(By.xpath("//a[@title='eMAG Help']")).click();
        Thread.sleep(2000);
        //driver.close();
        driver.quit();




    }
}
