package Rolex_WebSite;

import Utlity.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _02_SearchManWacthFunctinaty {
    public _02_SearchManWacthFunctinaty() {
        PageFactory.initElements(BaseDriver.driver,this);
    }
   @FindBy(css = "button[type='button']")
    public WebElement Search;

    @FindBy(css = "input[placeholder='Ara']")
    public WebElement Searchbutton;

    @FindBy(css = "button[aria-label='Arama girişini onayla']")
    public WebElement SearchbuttonConfirim;

    @FindBy(css = "a[aria-label='Rolex saatinizi bulun']")
    public WebElement FindYoursRolex;

    @FindBy(css = "label[class='css-zv1osn e11aoqqd2']")
    public WebElement ProfesyonelRolex;

    @FindBy(css = "a[aria-label='Submariner’ı keşfedin']")
    public WebElement ProfesyonelRolexCoice;





}

