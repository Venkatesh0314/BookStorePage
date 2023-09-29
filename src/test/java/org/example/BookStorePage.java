package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookStorePage {
    public static void main(String[] args) {
        try {
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            //maximize the window
            driver.manage().window().maximize();
            // to open the url
            driver.get("https://qabookstorepage.ccbp.tech/");
            // click first click button
            WebElement firstElement=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/button"));
            firstElement.click();
            // first back element
            WebElement FirstBackElement=driver.findElement(By.xpath("/html/body/div[2]/div/button[1]"));
            FirstBackElement.click();
            // second elemnt click button
            WebElement secondElement=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/button"));
            secondElement.click();
            // click the back button
            WebElement secondBackElement=driver.findElement(By.xpath("/html/body/div[3]/div/button[1]"));
            secondBackElement.click();
            // click the readnow button
            WebElement thirdElement=driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/button"));
            thirdElement.click();
            //to return the back button
            WebElement thirdBackElement=driver.findElement(By.xpath("/html/body/div[4]/div/button[1]"));
            thirdBackElement.click();
            // close the driver
            driver.close();


        } catch (Exception e) {
            System.out.println("Hi venkatesh please check your code Exception error:" + e);
        }
    }
}