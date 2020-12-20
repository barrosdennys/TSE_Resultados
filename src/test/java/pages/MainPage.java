package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import util.Utils;

public class MainPage {
    private final Utils util;
    private String firstLegResourceId = "alert-input-5-0";
    private String informationTabResourceId = "tab-button-informacoes";
    private String resultadosTabResourceId = "tab-button-resultados";

    public MainPage(AppiumDriver<MobileElement> driver) {
        this.util = new Utils(driver);
    }

    public void clickOnMenuOption(String option) {
        util.getElementByPartialText(option).click();
    }

    public void selectFirstLeg() {
        util.getButtonWithPartialText("TURNO").click();
        util.getElementByResourceId(firstLegResourceId).click();
        util.getButtonWithPartialText("CONFIRMAR").click();
    }

    public void selectInformationTab(){
        util.getElementByResourceId(informationTabResourceId).click();
    }

    public void selectVereador(String vereador){
        util.scrollUntilTheEnd();
        util.getButtonWithPartialText(vereador).click();
    }

    public void selectElectionFilter(String election){
        util.getButtonWithPartialText(election).click();
        util.scrollUntilTheTop();
    }

    public void selectResultadosTab() throws InterruptedException {
        Thread.sleep(4000);
        util.getElementByResourceId(resultadosTabResourceId).click();
    }
}
