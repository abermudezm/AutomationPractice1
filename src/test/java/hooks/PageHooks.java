package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class PageHooks {

    @Before
    public void Before(){
        System.out.println("Before hook");
    }

    @After
    public void After(){
        System.out.println("After hook");
    }
}
