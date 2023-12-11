package org.example;

public class Person {
    public String getName() {
        return name;
    }
    @MyFirstAnnotation(value = "hello")
    private String name;
    private String surname;

    private String city;

    public String getSurname() {
        return surname;
    }

    public String getCity() {
        return city;
    }

    public void die(){
        System.out.println("I am dead!");
    }
}
