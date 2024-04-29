package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://www.google.com");
        Thread.sleep(2000);
        chromeDriver.quit();

        System.setProperty("webdriver.firefox.driver", "drivers/geckodriver.exe");

        WebDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("http://www.google.com");
        Thread.sleep(2000);
        firefoxDriver.quit();

        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");

        WebDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("http://www.google.com");
        Thread.sleep(2000);
        edgeDriver.quit();
    }
}