package fr.lernejo.tester;
import java.lang.IllegalStateException;

import fr.lernejo.tester.api.TestMethod;

public class SomeLernejoTests
{
    @TestMethod
    public void ok(){

    }

    @TestMethod
    public void ko() {
        throw new IllegalStateException();
    }


    public void none() {

    }
}
