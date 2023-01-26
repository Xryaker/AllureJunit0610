import config.BaseClass;
import data.DBcertificat;
import data.PairCertificat;
import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.support.PageFactory;
import pageObjects.CerPage;
import watchers.MyWatch;

import java.util.Collection;

@RunWith(Parameterized.class)
@DisplayName("Check validation certificate")
@Story("TEST HILLEL")
@Feature("GROUP FEATURE")
@Epic("SOME EPIC")
public class TestCHECKCertificate extends BaseClass {
    @Rule
    public
    MyWatch watch=new MyWatch();
    PairCertificat pairCertificat;
    CerPage cerPage;

    @Parameterized.Parameters
    public static Collection options() {
        return DBcertificat.getListCer();
    }


    public TestCHECKCertificate(PairCertificat pairCertificat) {
        this.pairCertificat = pairCertificat;
        cerPage = PageFactory.initElements(driver, CerPage.class);
        driver.get("https://certificate.ithillel.ua/");
    }

    @Test
    @DisplayName("Check certificate")
    @Description("   Assert.assertEquals(String.valueOf(cerPage.checkCER(pairCertificat.getCerNumber())),\n" +
            "                String.valueOf(pairCertificat.isAnswer()));")
    @Severity(SeverityLevel.CRITICAL)
    public void test1() {
      //  printSome("VASILIY SHEVCHENKO");
        Assert.assertEquals(String.valueOf(cerPage.checkCER(pairCertificat.getCerNumber())),
                String.valueOf(pairCertificat.isAnswer()));
    }
//    @Step("PRINT SOME TEXT")
//    public void printSome(String text){
//        System.out.println(text);
//    }
}
