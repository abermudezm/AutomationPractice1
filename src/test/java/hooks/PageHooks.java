package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import stepsdefinitions.LoginSteps;

public class PageHooks {

    @Before
    public void Before(){
        System.out.println("Before hook");
    }

    @After
    public void After(){
        System.out.println("After hook");
        LoginSteps.driver.close();
    }
}
