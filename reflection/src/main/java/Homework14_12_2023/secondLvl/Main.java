package Homework14_12_2023.secondLvl;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        // Получаем класс
        Class<?> clazz = ExampleClass.class;

        // Проверяем, применена ли аннотация к классу
        if (clazz.isAnnotationPresent(MyThirdAnnotation.class)) {
            // Создаем экземпляр класса с использованием конструктора по умолчанию
            ExampleClass instance = (ExampleClass) clazz.newInstance();

            // Заполняем ссылочные поля объектами
            fillFieldsWithDefaults(instance);

            // Выводим результат
            System.out.println("Заполненный экземпляр: " + instance);
        } else {
            System.out.println("Аннотация не применена к классу");
        }
    }

    private static void fillFieldsWithDefaults(Object obj) throws IllegalAccessException, InstantiationException {
        // Получаем все поля класса
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {
            // Устанавливаем доступность private полей
            field.setAccessible(true);

            // Проверяем, является ли поле ссылочным (не примитивным)
            if (!field.getType().isPrimitive()) {
                // Создаем объект для заполнения поля
                Object value = field.getType().newInstance();

                // Устанавливаем значение поля
                field.set(obj, value);
            }
        }
    }
}
