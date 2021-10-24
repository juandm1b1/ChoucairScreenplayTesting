package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

//    public static final Target BUTTON_UC = Target.the("Link to enter Choucair University")
//            .located(By.linkText("..course/index.php?categoryid=2"));

    public static final Target BUTTON_UC = Target.the("Link to enter Choucair University")
            .located(By.xpath("//div[@id='universidad']//strong"));

    public static final Target INPUT_COURSE = Target.the("Searching for the course")
            .located(By.id("coursesearchbox"));

    public static final Target BUTTON_GO = Target.the("Click to search for the course")
            .located(By.id("//button[@class='btn btn-secondary']"));

    public static final Target SELECT_COURSE = Target.the("Click to select the course")
            .located(By.xpath("//h4[contains(text(),'Recursos Automatización Bancolombia')]"));

    //-----------
    public static final Target NAME_COURSE = Target.the("Extracts the name of the course")
            .located(By.xpath("//h1[contains(text(),'Recursos Automatización Bancolombia')]"));
}
