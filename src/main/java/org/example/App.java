package org.example;

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
        Thread.sleep(2000);
        driver.quit();




    }
}
