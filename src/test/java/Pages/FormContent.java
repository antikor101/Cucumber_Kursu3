package Pages;

import Utilities.GWD;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormContent extends Parent {

    public FormContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//mat-select[@formcontrolname='id']/div/div)[1]")
    private WebElement academicPeriod;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[1]")
    private WebElement academicPeriod1;

    @FindBy(xpath = "(//mat-select[@formcontrolname='id']/div/div)[3]")
    private WebElement gradeLevel;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[1]")
    private WebElement gradeLevel2;

    @FindBy(xpath = "(//mat-select[@formcontrolname='gender']/div/div)[1]")
    private WebElement gender;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[2]")
    private WebElement male;

    @FindBy(xpath = "(//mat-select[@formcontrolname='types']/div/div)[1]")
    private WebElement employeeType;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[3]")
    private WebElement other;




    WebElement myElement;


    public void findAndClick(String strElement) {

        switch (strElement) {
            case "academicPeriod":myElement = academicPeriod;break;
            case "academicPeriod1":myElement = academicPeriod1;break;
            case "gradeLevel":myElement = gradeLevel;break;
            case "gradeLevel2":myElement = gradeLevel2;break;
            case "gender":myElement = gender;break;
            case "male":myElement = male;break;
            case "employeeType":myElement = employeeType;break;
            case "other":myElement = other;break;

        }
        clickFunction(myElement);
        if (myElement==other) {
            escmethod();
        }
    }

    public void SearchAndDelete(String searchText)  {
        findAndClick("searchButton");

        //   WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
        // wait.until(ExpectedConditions.stalenessOf(deleteButton));
        waitUntilLoading();
        //GWD.Bekle(2);

        findAndClick("deleteButton");
        findAndClick("deleteDialogBtn");


    }
    public void escmethod() {
        Actions aksiyonlar=new Actions(GWD.driver);
        Action aksiyon=aksiyonlar.keyDown(Keys.ESCAPE).keyUp(Keys.ESCAPE).build();
        aksiyon.perform();

    }
}