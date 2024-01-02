package Rolex_WebSite;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_SearchManWacth extends BaseDriver {

    @Test
    void SearcTest(){

        _02_SearchManWacthFunctinaty elements = new _02_SearchManWacthFunctinaty();

        wait.until(ExpectedConditions.elementToBeClickable(elements.Search)).click();
        elements.Searchbutton.sendKeys("new mens wacth");
        elements.SearchbuttonConfirim.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.FindYoursRolex)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.ProfesyonelRolex)).click();


       // wait.until(ExpectedConditions.urlContains("submariner"));

        WebElement texttrue = driver.findElement(By.xpath("(//p[@class='chapo css-1t72yy3 css-1qz8uy6 e1qasnby0'])[1]"));
        Assert.assertEquals(texttrue.getText(),"Yüzeyin altında");

    }



}
