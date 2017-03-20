package VladimirRudenko.app.classwork.lesson17;

/**
 * Created by vladimir on 13.03.17.
 */
public class Test {
    public static void main(String[] args) {
        BoxPrinter value1 = new BoxPrinter(new Integer(10));
        System.out.println(value1);
        Integer intValue1 = (Integer) value1.getValue();
        BoxPrinter value2 = new BoxPrinter("Hello world");
        System.out.println(value2);
        Integer intValue2 = (Integer) value2.getValue();
    }
}
