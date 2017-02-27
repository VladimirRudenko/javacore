package VladimirRudenko.runners;

import VladimirRudenko.app.homework.lesson12.Human;

/**
 * Created by vladimir on 27.02.17.
 */
public class Lesson12Runner {
    public static void main(String[] args) {
        Human human = new Human(27,"Vova");
        System.out.println(human.getName());
        System.out.println(human.getAge());
        human.setAge(29);

        System.out.println(human.getName());
        System.out.println(human.getAge());
        human.setAge(121);

        System.out.println(human.getName());
        System.out.println(human.getAge());

    }
}
