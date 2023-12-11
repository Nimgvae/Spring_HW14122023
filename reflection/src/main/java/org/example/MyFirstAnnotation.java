package org.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = {ElementType.METHOD, ElementType.TYPE,ElementType.FIELD})//это и ниже позволяет описывать другие анотации. Так же они обе описывают САМИ СЕБЯ.
@Retention(value = RetentionPolicy.RUNTIME)//регулятор видимости нашей Аннотации.
public @interface MyFirstAnnotation {
    String value();


}
