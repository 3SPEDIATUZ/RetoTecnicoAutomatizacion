package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UterJoinTodayPage extends PageObject {

    public static final Target JOINTODAY_BUTOON = Target.the("Boton para iniciar el registro").
            located(By.className("unauthenticated-nav-bar__sign-up"));

    public static final Target INPUT_FIRSTNAME = Target.the("Campo para diligenciar primer nombre").
            located(By.xpath("//*[@id=\"firstName\"]"));

    public static final Target INPUT_LASTNAME = Target.the("Campo para diligenciar apellido").
            located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the("Campo para diligenciar email").
            located(By.name("email"));

    public static final Target SELECT_MOTH = Target.the("Seleccionar el mes").
            located(By.id("birthMonth"));

    public static final Target SELECT_DAY = Target.the("Seleccionar el dia").
            located(By.id("birthDay"));

    public static final Target SELECT_YEAR = Target.the("Seleccionar el año").
            located(By.id("birthYear"));

    public static final Target INPUT_LANGUAGES = Target.the("Campo para elegir lenguaje").
            located(By.className("ui-select-search input-xs ng-pristine ng-valid ng-empty ng-touched"));

    public static final Target INPUT_CITY = Target.the("Campo para diligenciar ciudad").
            located(By.id("city"));

    public static final Target INPUT_ZIP = Target.the("Campo para dilegincar codigo postal").
            located(By.name("zip"));

    public static final Target SELECT_COUNTRY = Target.the("Seleccionar el pais").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));

    public static final Target INPUT_SEARCH_COUNTRY =  Target.the("Buscar pais").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));

    public static final Target SELECT_COMPUTER = Target.the("Seleccionar el computador").
            located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div"));

    public static final Target INPUT_SEARCH_COMPUTER = Target.the("Busca el computador").
            located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target SELECT_VERSION = Target.the("Seleccion la version").
            located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div"));

    public static final Target INPUT_SEARCH_VERSION = Target.the("Busca la version").
            located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));

    public static final Target SELECT_LANGUAGE = Target.the("Selecciona lenguaje").
            located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]"));

    public static final Target INPUT_SEARCH_LANGUAGE = Target.the("Busca lenguaje").
            located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));

    public static final Target SELECT_MOBILE_DEVICE = Target.the("Selecciona dispositivo").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div"));

    public static final Target INPUT_SEARCH_MOBILE_DEVICE = Target.the("Busca dispositivo").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target SELECT_MODEL = Target.the("Selecciona modelo").
           located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]"));

    public static final Target INPUT_MODEL = Target.the("Busca el modelo").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));

    public static final Target SELECT_OPERATING_SYSTEM = Target.the("Seleccion sistema operativo").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]"));

    public static final Target INPUT_OPERATING_SYSTEM = Target.the("Busca el dispositivo").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));

    public static final Target NEXT_LOCATION_BUTTON = Target.the("Boton para seguir el registro parte 1").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));

    public static final Target NEXT_DEVICES = Target.the("Boton para seguir registro parte 2").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));

    public static final Target NEX_LAST_STEP = Target.the("Boton para seguir registro parte 3").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));

    public static final Target INPUT_PASSWORD = Target.the("Campo para digitar la contraseña").
            located(By.id("password"));

    public static final Target INPUT_REPASSWORD = Target.the("Campo para confirmar la contraseña").
            located(By.id("confirmPassword"));

    public static final Target CHECK_STAY_INFORMED = Target.the("Chekear si acepta stay informed").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/span"));

    public static final Target CHECK_READ_ACCEPT = Target.the("Chekear read and accept").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target CHECK_PRIVACY_SEGURITY = Target.the("Chekear privacy & security").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target COMPLETE_SETUP_BUTTON = Target.the("Boton para terminar el registro").
            located(By.xpath("//*[@id=\"laddaBtn\"]"));

    public static final Target PASS_REGISTER = Target.the("Extrae registro exitoso").
            located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));
}



