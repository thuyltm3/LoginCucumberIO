package logincucumber.tasks;

import logincucumber.ui.CucumberStudioPageElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    private final String txtEmail;
    private final String txtPassword;

    protected Login(String txtEmail, String txtPassword) {
        this.txtEmail = txtEmail;
        this.txtPassword = txtPassword;
    }

    @Step("{0} Login with email '#txtEmail' and password '#txtPassword'")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(txtEmail)
                        .into(CucumberStudioPageElements.EMAIL_FIELD),
                Enter.theValue(txtPassword)
                        .into(CucumberStudioPageElements.PASSWORD_FIELD),
                Click.on(CucumberStudioPageElements.BTN_SIGNIN)
        );
    }

    public static Login loginThePage(String txtEmail, String txtPassword) {
        return instrumented(Login.class
                ,txtEmail,txtPassword);
    }
}
