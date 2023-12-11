package Homework14_12_2023.secondLvl;
@MyThirdAnnotation
public class ExampleClass {
    private String field1;
    private int field2;
    private boolean field3;

    public ExampleClass() {

    }

    public ExampleClass(String field1, int field2, boolean field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    @Override
    public String toString() {
        return "ExampleClass{" +
                "field1='" + field1 + '\'' +
                ", field2=" + field2 +
                ", field3=" + field3 +
                '}';
    }
}
