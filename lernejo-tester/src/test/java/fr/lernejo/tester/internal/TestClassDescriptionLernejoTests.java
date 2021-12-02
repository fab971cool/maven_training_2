package fr.lernejo.tester.internal;

import fr.lernejo.tester.SomeLernejoTests;

public class TestClassDescriptionLernejoTests
{
    TestClassDescription testClass = new TestClassDescription(SomeLernejoTests.class);

    static void check_all_in(Class<?> my_class)
    {
        TestClassDescription testClass = new TestClassDescription(my_class);

        testClass .listTestMethods();
        System.out.println(testClass.listTestMethods());
    }


    public static void main(String[] args)
    {
        check_all_in(SomeLernejoTests.class);
    }
}
