//package org.example;
//
//import com.sun.tools.javac.util.Names;
//
//import java.lang.annotation.Annotation;
//import java.lang.reflect.Constructor;
//import java.lang.reflect.Field;
//import java.lang.reflect.InvocationTargetException;
//import java.util.Arrays;
//public class AnnotationReflection {
//    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
//        Person person = new Person();
//        Class<? extends Person> personClass = person.getClass();
//
//
//        Constructor<?>[] constructors = personClass.getConstructors();//знак вопроса в генерике дает возможность засунуть любой тип конструкторов.
//        Constructor<?> constructor = constructors[0];
//        Object object = constructor.newInstance();
//        Person generatedPerson = (Person) object;
//
//
//        Field[] fields = personClass.getDeclaredFields();
//        for (Field field : fields) {
//          Annotation[]  annotations = field.getAnnotations();
//            for (Annotation annotation : annotations) {
//                if (annotation.annotationType().equals(MyFirstAnnotation.class)){
//                    field.setAccessible(true);
//                    field.set(person, "John");
//
//                }
//            }
//        }
//        System.out.println(person.getName());
//        System.out.println(person.getSurname());
//        System.out.println(person.getCity());
//    }
//
//}
