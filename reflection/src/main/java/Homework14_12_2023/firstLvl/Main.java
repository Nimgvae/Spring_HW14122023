package Homework14_12_2023.firstLvl;

public class Main {
    public static void main(String[] args) {
        // Получаем класс
        Class<?> clazz = ExampleClass.class;

        // Проверяем, применена ли аннотация к классу
        if (clazz.isAnnotationPresent(MySecondAnnotation.class)) {
            MySecondAnnotation classAnnotation = (MySecondAnnotation) clazz.getAnnotation(MySecondAnnotation.class);
            System.out.println("Аннотация на классе: " + classAnnotation.value());
        }

        // Проверяем применение аннотации к полям
        for (var field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(MySecondAnnotation.class)) {
                MySecondAnnotation fieldAnnotation = field.getAnnotation(MySecondAnnotation.class);
                System.out.println("Аннотация на поле '" + field.getName() + "': " + fieldAnnotation.value());
            }
        }
    }
}
