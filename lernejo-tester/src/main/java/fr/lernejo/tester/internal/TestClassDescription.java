package fr.lernejo.tester.internal;

import fr.lernejo.tester.api.TestMethod;

import java.lang.reflect.Method;
import java.lang.Class;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public class TestClassDescription
{
    Class<?> my_class;

    public TestClassDescription( Class<?> my_class)
    {
        this.my_class = my_class;
    }

    public List<Method> listTestMethods(){
        List<Method> result = new ArrayList<Method>();
        for ( Method method : my_class.getDeclaredMethods()){
            if (Modifier.isPublic(method.getModifiers()) && method.getReturnType().equals(Void.TYPE) &&
                method.getParameterCount() == 0 && method.isAnnotationPresent(TestMethod.class))
                {
                    result.add(method);
                }

        }


        /*objet de type "class*/
        return result;
    }
}
