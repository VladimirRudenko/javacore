package VladimirRudenko.app.classwork.lesson15;

/**
 * Created by vladimir on 06.03.17.
 */
public class Run {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent vi = new Child1();
        Parent cv = new Child2();
        parent.say();
        vi.say();
        cv.say();

    }
}
