package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import util.Utils;

public class MainPage {
    private final Utils util;
    private String firstLegResourceId = "alert-input-5-0";
    private String informationTabResourceId = "tab-button-informacoes";
    private String resultadosTabResourceId = "tab-button-resultados";
    private String favoritosResourceId = "tab-button-favoritos";


    public MainPage(AppiumDriver<MobileElement> driver) {
        this.util = new Utils(driver);
    }

    public void selectFirstLeg() {
        util.getButtonWithPartialText("TURNO").click();
        util.getElementByResourceId(firstLegResourceId).click();
        util.getButtonWithPartialText("CONFIRMAR").click();
    }

    public void selectVereador(String button) {
        util.scrollUntilTheEnd();
        util.getButtonWithPartialText(button).click();
    }

    public void selectElectionFilter(String election) {
        util.getButtonWithPartialText(election).click();
        util.scrollUntilTheTop();
    }

    public void selectResultadosTab() {
        util.getElementByResourceId(resultadosTabResourceId).click();
    }

    public void selectFavoritoTab() {
        util.getElementByResourceId(favoritosResourceId).click();
    }

    public void selectInformationTab() {
        util.getElementByResourceId(informationTabResourceId).click();
    }
}
