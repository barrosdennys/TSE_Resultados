package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import util.DriverManager;
import util.Utils;

public class ElectionFilterPage {

    private final Utils util;
    private String favoritosResourceId = "tab-button-favoritos";

    public ElectionFilterPage(AppiumDriver<MobileElement> driver) {
        this.util = new Utils(driver);
    }


    public void selectElectionFilter(String election){

        util.getButtonWithPartialText(election).click();
        util.scrollUntilTheTop();
    }

    public void clickOnUFList(String ufList){
        DriverManager.getWait();
        util.scrollUntilTheTop();
        util.getElementByPartialText(ufList).click();
    }

    public void selectUF(String state){
        util.getElementByPartialText(state).click();
        util.getButtonWithPartialText("OK").click();
    }

    public void selectFirstLeg(String firstLeg) throws InterruptedException {
        util.getButtonWithPartialText(firstLeg).click();
        DriverManager.getWait();
        Thread.sleep(5000);
    }

    public void selectVereador(String vereador){
        DriverManager.getWait();
        util.scrollUntilTheEnd();
        DriverManager.getWait();
        util.getButtonWithPartialText(vereador).click();
    }

    public void verifyMostVoted(String text){
        DriverManager.getWait();
        util.scrollUntilText(text);
    }

    public void selectFirstCandidate(String text){
        util.getButtonWithPartialText(text).click();
    }

    public void selectFavoritarCandidato(String text){
        util.getButtonWithPartialText(text).click();
        util.getButtonWithPartialText("Fechar").click();
    }

    public void selectFavoritoTab(){
        util.getElementByResourceId(favoritosResourceId).click();
    }
}

