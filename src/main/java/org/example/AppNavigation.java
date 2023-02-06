package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppNavigation {

     //    Using Navigation commands
     // 1. Launch a Chrome Browser
     // 2. Navigate to Url: https://www.bigfish.ro/
     // 3. Maximize the window
     // 4. Navigate to Url: https://altex.ro/
     // 5. Enter some value in text-box
     // 6. Refresh the page
     // 7. Navigate back to bigfish.ro
     // 8. Navigate forward to altex.ro
     // 9. Close the browser


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://Users//ACER//Downloads//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.quit();
    }
}
