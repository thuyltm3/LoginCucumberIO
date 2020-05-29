package logincucumber.tasks;

import logincucumber.ui.CucumberStudioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenBrowser implements Task {

    CucumberStudioPage cucumberStudioPage;

    @Step("Open the application")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(cucumberStudioPage)
        );
    }
}
