import VelocityTest.TestComponent.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import velocity.Pageobjects.LoginPage;

import java.util.Iterator;

public class LoginTest extends BaseTest {


    @Test(dataProvider = "data")
    public void LoginTestCases(String email, String password) {
        brow();
        LoginPage Login = new LoginPage(driver);
        Login.Login(email, password);
    }

    @DataProvider
    public Object[][] data() {
        return new Object[][]{{"naman@gmail.com", "hello@123"}, {"namana@gmail.com", "password@123"}};

    }
}
