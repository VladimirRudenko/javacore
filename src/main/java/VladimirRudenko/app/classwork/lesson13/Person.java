package VladimirRudenko.app.classwork.lesson13;

/**
 * Created by vladimir on 27.02.17.
 */
public class Person {
    private String name;

    public Person(String name){
        this.name= name;
    }
    public final void qestion(String question){
        question = "Which subject";
        System.out.println(question);
    }
}
