package co.com.choucair.certification.proyectobase.questions;

import co.com.choucair.certification.proyectobase.userinterface.UterJoinTodayPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private String question;
    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question){
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String passRegister = Text.of(UterJoinTodayPage.PASS_REGISTER).viewedBy(actor).asString();
        boolean result;

        System.out.printf("question: "+question+"\n");
        System.out.printf("passRegister: "+passRegister+"\n");

        if (question.equals(passRegister)){
            result = true;
        }else{
            result = false;
        }
        System.out.printf("result: "+result+"\n");
        return result;
    }
}
