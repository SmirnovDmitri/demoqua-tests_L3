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
        Configuration.browserSize = "1920x1200";
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTest() {
        open("/text-box");
        $("#userName").setValue("Alex");
        $("#userEmail").setValue("alex@alex.com");
        $("#currentAddress").setValue("Some street 1");
        $("#permanentAddress").setValue("Shosse Intuziastov 28");
        $("#submit").click();

        $("#output #name").shouldHave(text("Alex"));
        $("#output").$("#email").shouldHave(text("alex@alex.com"));
        $("#output").$("#currentAddress").shouldHave(text("Some street 1"));
        $("#output").$("#permanentAddress").shouldHave(text("Shosse Intuziastov 28"));
    }
}
