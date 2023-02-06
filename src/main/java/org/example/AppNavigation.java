package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppNavigation {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://Users//ACER//Downloads//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.quit();
    }
}
