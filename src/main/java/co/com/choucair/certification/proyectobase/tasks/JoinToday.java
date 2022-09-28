package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.model.Utest;
import co.com.choucair.certification.proyectobase.userinterface.UterJoinTodaySite;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import java.util.List;

public class JoinToday  implements Task {

    private String strFirtsName;
    private String strLastName;
    private String strEmail;
    private String strMoth;
    private String strDay;
    private String strYear;
    private String strCity;
    private String strZip;
    private String strCountry;
    private String strComputer;
    private String strVersion;
    private String strLanguage;
    private String strMobileDevice;
    private String strModel;
    private String strOperatingSystem;
    private String strPassword;
    private String strRepassword;

    public JoinToday(String strFirtsName, String strLastName, String strEmail, String strMoth, String strDay, String strYear, String strCity, String strZip, String strCountry, String strComputer, String strVersion, String strLanguage, String strMobileDevice, String strModel, String strOperatingSystem, String strPassword, String strRepassword) {
        this.strFirtsName = strFirtsName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMoth = strMoth;
        this.strDay = strDay;
        this.strYear = strYear;
        this.strCity = strCity;
        this.strZip = strZip;
        this.strCountry = strCountry;
        this.strComputer = strComputer;
        this.strVersion = strVersion;
        this.strLanguage = strLanguage;
        this.strMobileDevice = strMobileDevice;
        this.strModel = strModel;
        this.strOperatingSystem = strOperatingSystem;
        this.strPassword = strPassword;
        this.strRepassword = strRepassword;
    }

    public static JoinToday onThePage(List<Utest> utestData){

        return Tasks.instrumented(JoinToday.class,utestData.get(0).getStrFirtsName(),
                utestData.get(0).getStrLastName(), utestData.get(0).getStrEmail(),utestData.get(0).getStrMoth(),
                utestData.get(0).getStrDay(),utestData.get(0).getStrYear(),utestData.get(0).getStrCity(),utestData.get(0).getStrZip(),
                utestData.get(0).getStrCountry(),utestData.get(0).getStrComputer(),utestData.get(0).getStrVersion(),utestData.get(0).getStrLanguage(),
                utestData.get(0).getStrMobileDevice(),utestData.get(0).getStrModel(),utestData.get(0).getStrOperatingSystem(),
                utestData.get(0).getStrPassword(), utestData.get(0).getStrRepassword());
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UterJoinTodaySite.JOINTODAY_BUTOON),
                Enter.theValue(strFirtsName).into(UterJoinTodaySite.INPUT_FIRSTNAME),
                Enter.theValue(strLastName).into(UterJoinTodaySite.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(UterJoinTodaySite.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strMoth).from(UterJoinTodaySite.SELECT_MOTH),
                SelectFromOptions.byVisibleText(strDay).from(UterJoinTodaySite.SELECT_DAY),
                SelectFromOptions.byVisibleText(strYear).from(UterJoinTodaySite.SELECT_YEAR),
                Click.on(UterJoinTodaySite.NEXT_LOCATION_BUTTON),

                Enter.theValue(strCity).into(UterJoinTodaySite.INPUT_CITY), Hit.the(Keys.ARROW_DOWN).into(UterJoinTodaySite.INPUT_CITY),
                Enter.theValue(strZip).into(UterJoinTodaySite.INPUT_ZIP),
                Enter.theValue(strZip).into(UterJoinTodaySite.INPUT_ZIP),
                Click.on(UterJoinTodaySite.SELECT_COUNTRY),
                Enter.theValue(strCountry).into(UterJoinTodaySite.INPUT_SEARCH_COUNTRY), Hit.the(Keys.ARROW_UP).into(UterJoinTodaySite.INPUT_SEARCH_COUNTRY),
                Click.on(UterJoinTodaySite.NEXT_DEVICES),

                Click.on(UterJoinTodaySite.SELECT_COMPUTER),
                Enter.theValue(strComputer).into(UterJoinTodaySite.INPUT_SEARCH_COMPUTER), Hit.the(Keys.ENTER).into(UterJoinTodaySite.INPUT_SEARCH_COMPUTER),
                Click.on(UterJoinTodaySite.SELECT_VERSION),
                Enter.theValue(strVersion).into(UterJoinTodaySite.INPUT_SEARCH_VERSION), Hit.the(Keys.ENTER).into(UterJoinTodaySite.INPUT_SEARCH_VERSION),
                Click.on(UterJoinTodaySite.SELECT_LANGUAGE),
                Enter.theValue(strLanguage).into(UterJoinTodaySite.INPUT_SEARCH_LANGUAGE), Hit.the(Keys.ENTER).into(UterJoinTodaySite.INPUT_SEARCH_LANGUAGE),
                Click.on(UterJoinTodaySite.SELECT_MOBILE_DEVICE),
                Enter.theValue(strMobileDevice).into(UterJoinTodaySite.INPUT_SEARCH_MOBILE_DEVICE), Hit.the(Keys.ENTER).into(UterJoinTodaySite.INPUT_SEARCH_MOBILE_DEVICE),
                Click.on(UterJoinTodaySite.SELECT_MODEL),
                Enter.theValue(strModel).into(UterJoinTodaySite.INPUT_MODEL), Hit.the(Keys.ENTER).into(UterJoinTodaySite.INPUT_MODEL),
                Click.on(UterJoinTodaySite.SELECT_OPERATING_SYSTEM),
                Enter.theValue(strOperatingSystem).into(UterJoinTodaySite.INPUT_OPERATING_SYSTEM), Hit.the(Keys.ENTER).into(UterJoinTodaySite.INPUT_OPERATING_SYSTEM),
                Click.on(UterJoinTodaySite.NEX_LAST_STEP),

                Enter.theValue(strPassword).into(UterJoinTodaySite.INPUT_PASSWORD),
                Enter.theValue(strRepassword).into(UterJoinTodaySite.INPUT_REPASSWORD),
                JavaScriptClick.on(UterJoinTodaySite.CHECK_STAY_INFORMED),
                JavaScriptClick.on(UterJoinTodaySite.CHECK_READ_ACCEPT),
                JavaScriptClick.on(UterJoinTodaySite.CHECK_PRIVACY_SEGURITY),
                Click.on(UterJoinTodaySite.COMPLETE_SETUP_BUTTON)
        );
    }
}
