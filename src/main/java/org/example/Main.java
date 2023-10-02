package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("test");
        driver.findElement(By.name("btnK")).click();
    }
}