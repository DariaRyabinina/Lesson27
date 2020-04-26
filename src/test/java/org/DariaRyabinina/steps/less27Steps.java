package org.DariaRyabinina.steps;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.ru.Допустим;
import org.DariaRyabinina.Less27Obj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import java.util.List;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


public class less27Steps {
    public static final Logger LOGG = LoggerFactory.getLogger(less27Steps.class);

    @Допустим("выполнен переход на https: www_sberbank")
    public void goToSberbankStep() {
        open("https://www.sberbank.ru/");
        getWebDriver().manage().window().maximize();


    }

    @Допустим("проверка названия титула {string}")
    public void verifyTitleStep(String nameTitle) {
        Less27Obj less27Obj = new Less27Obj();
        boolean a = less27Obj.getTitle(nameTitle);
        System.out.println(a);
        if (!a) {
            Assert.fail();
        }
    }

    @Допустим("выполнен переход на вкладку {string}")
    public void goToMenuStep(String nameMenu) {
        Less27Obj less27Obj = new Less27Obj();
        less27Obj.movement_cursor(nameMenu);
        less27Obj.goToMenu("Вклады");
    }

    @Допустим("выполнен переход на меню {string}")
    public void goToMenuVkladStep(String nameMenu) {
        Less27Obj less27Obj = new Less27Obj();
        less27Obj.goToMenuVkladObj(nameMenu);

    }

    @Допустим("проверка отображения чек-боксов")
    public void verifyCheckBoxStep(List<String> checkBoxList) {
        Less27Obj less27Obj = new Less27Obj();
        less27Obj.visibleCheckBox(checkBoxList);

    }

    @Допустим("проверка чек-бокса «Онлайн»")
    public void selectedOnlineStep() {
        boolean selectedOnline = $(byXpath("//div[text()='Онлайн']/preceding-sibling::input")).isSelected();
        Assert.assertTrue(selectedOnline);
    }

    @Допустим("проверка отражения вкладов")
    public void verefyVkladStep(List<String> vkladList) {
        Less27Obj less27Obj = new Less27Obj();
        less27Obj.visibleVklad(vkladList);

    }


    @Допустим("установка чек-боксов")
    public void enterCheckBoxStep(List<String> entrChecBoxValue) {
        Less27Obj less27Obj = new Less27Obj();
        less27Obj.enterCheckBox(entrChecBoxValue);


    }

    @Допустим("проверка отображения вкладов Отсутствуют")
    public void verefyVkladDelStep(List<String> vkladListDel) {
        Less27Obj less27Obj = new Less27Obj();
        less27Obj.visibleVkladDel(vkladListDel);
    }

    @Допустим("нажать кнопку Подробнее")
    public void entrButton() {
        $(byXpath("//span[text()='Подробнее']")).click();
    }

    @Допустим("проверка надписи Вклад Управляй.")
    public void verefyStringUpravly() {
        Less27Obj less27Obj = new Less27Obj();
        less27Obj.verefyValue();
    }

    @Допустим("переключение на новое окно")
    public void swichToWindow() {
        Selenide.switchTo().window(1);
    }
}


