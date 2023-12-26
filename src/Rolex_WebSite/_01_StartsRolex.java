package Rolex_WebSite;

import Utlity.BaseDriver;
import Utlity.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class _01_StartsRolex extends BaseDriver {

    By SearchKeysClick = By.cssSelector("button[type='button']");
    By SearchSendKeys = By.cssSelector("input[placeholder='Ara']");
    @Test
    void Test1(){

        Tools.Bekle(6);
        wait.until(ExpectedConditions.visibilityOfElementLocated(SearchKeysClick)).click();

        Tools.Bekle(2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(SearchSendKeys)).sendKeys("Man Wacth 2023"+Keys.ENTER);






    }
}
