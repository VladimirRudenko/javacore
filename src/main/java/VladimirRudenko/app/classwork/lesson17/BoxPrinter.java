package VladimirRudenko.app.classwork.lesson17;

/**
 * Created by vladimir on 13.03.17.
 */
public class BoxPrinter {
    private Object val;
    public BoxPrinter(Object arg) {
        val = arg;
    }
    public String toString() {
        return "{" + val + "}";
    }
    public Object getValue() {return val;}
}
