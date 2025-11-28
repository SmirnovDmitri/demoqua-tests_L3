package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.remote.http.Route.options;

public class HomeWorkAutomationPracticeForm {

    File fileToUpload = new File("src/test/resources/test.jpg");

    @BeforeAll
    static void beforAll() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1200";
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillAllFormsTest() {
        open("/automation-practice-form");
        $("#firstName").setValue("Oleg");
        $("#lastName").setValue("Kukushkin");
        $("#userEmail").setValue("oleg@mail.es");
        $("input#gender-radio-1").sibling(0).click();
        $("input[placeholder='Mobile Number']").setValue("1234567890");
        $("input#dateOfBirthInput").click();
        $("select.react-datepicker__month-select").selectOption("January");
        $("select.react-datepicker__year-select").selectOption("1980");
        $("div.react-datepicker__day--022").click();
        $("input#subjectsInput").setValue("c").pressEnter().setValue("h").pressEnter();
        $("#hobbiesWrapper label[for='hobbies-checkbox-1']").click();
        $("#hobbiesWrapper label[for='hobbies-checkbox-2']").click();
        $("#hobbiesWrapper label[for='hobbies-checkbox-3']").click();
//        $x("//*[@id='hobbiesWrapper']/div[2]/div[1]/label").click();
        $("input#uploadPicture").uploadFile(fileToUpload);
        $("#currentAddress").setValue("INDIA");
        $("#state").click();
        actions().sendKeys("utt", Keys.ENTER).perform();
        $("#city").click();
        actions().sendKeys("m", Keys.ENTER).perform();




    }

}
