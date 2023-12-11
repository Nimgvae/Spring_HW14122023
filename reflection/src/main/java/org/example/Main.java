package org.example;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
@MyFirstAnnotation(value = "hello")
public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Class<Person> cl = Person.class;
        Method[] methods = cl.getDeclaredMethods();
        Field field = cl.getDeclaredField("name");
        System.out.println(Arrays.toString(methods));
        System.out.println(field);
        System.out.println(field.getName());
        System.out.println(field.getType());
        System.out.println("--------------------------------------------");
        Person john = new Person();
        System.out.println(john.getName());
        field.setAccessible(true);
        field.set(john, "John");
        System.out.println(john.getName());
        for (Method method : methods) {
            System.out.println(method);
            method.invoke(john);//вызовет метод die через рефликсию.
        }
        Method die = cl.getDeclaredMethod("die");
        die.invoke(john);
        cl.getAnnotations();

    }
}