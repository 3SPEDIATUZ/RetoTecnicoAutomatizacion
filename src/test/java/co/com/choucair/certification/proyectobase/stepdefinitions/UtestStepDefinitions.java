package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.Utest;
import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.JoinToday;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Dado que Ivan quiere probar su codigo automatizacion abrimos la pagina Utest$")
    public void dadoQueIvanQuiereProbarSuCodigoAutomatizacionAbrimosLaPaginaUtest() throws Exception {
        OnStage.theActorCalled("Ivan").wasAbleTo(OpenUp.thePage());
    }


    @When("^Cuando abre el formulario registro, se llenan todos los campos$")
    public void cuandoAbreElFormularioRegistroSeLlenanTodosLosCampos(List<Utest> utestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(JoinToday.onThePage(utestData));
    }

    @Then("^Luego se registra correctamente el usuario encuentra el mensaje$")
    public void luegoSeRegistraCorrectamenteElUsuarioEncuentraElMensaje(List<Utest> utestData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(utestData.get(0).getQuestion())));
    }
}
