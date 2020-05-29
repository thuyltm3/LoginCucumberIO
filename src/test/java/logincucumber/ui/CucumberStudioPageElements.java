package logincucumber.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CucumberStudioPageElements {

    public static Target EMAIL_FIELD    =  Target.the("email field")
            .located(By.cssSelector("input[type=email]"));

    public static Target
            PASSWORD_FIELD = Target.the("password field")
            .located(By.cssSelector("input[type=password]"));

    public static Target BTN_SIGNIN = Target.the("btn login")
            .located(By.cssSelector("input[type=submit]"));

    public static Target ERROR_MESSAGE_ELEMENT   = Target.the("error message element")
            .located(By.cssSelector("div[class=ht-alert__content]"));
}
