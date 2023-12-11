package Homework14_12_2023.firstLvl;
@MySecondAnnotation("Тестовый класс")
public class ExampleClass {
    @MySecondAnnotation("Тестовое поле")
    private String stringValue;
    private int intValue;
      public ExampleClass(){};

      //Делаю с обеими полями конструктор  чисто мышечно что ли, ну или чтобы был.
    public ExampleClass(String stringValue, int intValue) {
        this.stringValue = stringValue;
        this.intValue = intValue;
    }

    @Override
    public String toString() {
        return "ExampleClass{" +
                "stringValue='" + stringValue + '\'' +
                ", intValue=" + intValue +
                '}';
    }
}
