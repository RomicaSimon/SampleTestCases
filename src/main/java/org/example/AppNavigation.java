package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppNavigation {

     //    Using Navigation commands
     // 1. Launch a Chrome Browser
     // 2. Navigate to Url: https://altex.ro/
     // 3. Maximize the window
     // 4. Navigate to Url: https://www.bigfish.ro/
     // 5. Enter some value in text-box
     // 6. Refresh the page
     // 7. Navigate back to altex.ro
     // 8. Navigate forward to bigfish.ro
     // 9. Close the browser


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://Users//ACER//Downloads//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Navigate to altex.ro
        driver.get("https://altex.ro/");
        System.out.println("Opening the altex page through driver.get() command");

        //maximize the page
        driver.manage().window().maximize();
        Thread.sleep(1000);

        // Navigate to bigfish.ro
        driver.navigate().to("https://www.bigfish.ro/");
        System.out.println("Navigated to bigfish page through driver.navigate().to() command");
        Thread.sleep(1000);

        //Enter some value in Search text-box and click on Cauta button
        driver.findElement(By.xpath("//input[@placeholder='Cauta in ...']")).sendKeys("Lansete");
        driver.findElement(By.cssSelector("#go-quick-search")).click();
        System.out.println("Entered value Lansete in Cauta field and clicked for searching");

        //Refresh the page
        driver.navigate().refresh();
        System.out.println("The page is refreshed");
        Thread.sleep(1000);

        //Navigate back to main page
        driver.navigate().back();
        System.out.println("Navigated bavk to the main page");
        Thread.sleep(2000);

        //Navigate back to altex page
        driver.navigate().back();
        System.out.println("Navigated back to altex.ro page");
        Thread.sleep(2000);

        //Navigate forward to bigfish page
        driver.navigate().forward();
        System.out.println("Navigated forward to bigfish.ro page");
        Thread.sleep(2000);

        //Quit the browser
        driver.quit();
    }
}
