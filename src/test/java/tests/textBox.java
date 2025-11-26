package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class textBox {

    @BeforeAll
    static void beforAll() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void fillFormTest() {
        open("https://demoqa.com/text-box");
        $("#userName").setValue("Alex");
        $("#userEmail").setValue("alex@alex.com");
        $("#currentAddress").setValue("Some street 1");
        $("#permanentAddress").setValue("Shosse Intuziastov 28");
        $("#submit").click();

//        $("[id=r1-1]").shouldHave(text("yandex.com"));
    }
}
