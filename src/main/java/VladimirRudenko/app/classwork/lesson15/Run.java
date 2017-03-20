package VladimirRudenko.app.classwork.lesson15;

/**
 * Created by vladimir on 06.03.17.
 */
public class Run {
   /* public static void main(String[] args) {
        Parent parent = new Parent();
        Parent vi = new Child1();
        Parent cv = new Child2();
        parent.say();
        vi.say();
        cv.say();

    }*/



    public static void main(String[] args) {
        User user = new User();
        user.name = "Vova";
        user.age = 55;
        User user1 = new User();
        user1.name = "Vova";
        user1.age = 55;

        System.out.println(user.equals(user1));

    }
}
