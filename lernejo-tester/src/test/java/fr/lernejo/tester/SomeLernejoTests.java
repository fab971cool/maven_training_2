package fr.lernejo.tester;

import fr.lernejo.tester.api.TestMethod;

public class SomeLernejoTests
{
    @TestMethod
    public void ok(){

    }

    @TestMethod
    public void ko() throws IllegalAccessException {
        throw new IllegalAccessException();
    }


    public void none() {

    }
}
