import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;
import utils.Screen;

@Story("TEST HILLEL")
@Feature("GROUP FEATURE")
@Epic("SOME EPIC")
public class TestSF {
    @DisplayName("SOME TEST")
    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void test(){
        System.out.println("PRINT TEXT");
        Assert.assertEquals("ss","ss");
        System.out.println(Screen.getString());
    }
}
