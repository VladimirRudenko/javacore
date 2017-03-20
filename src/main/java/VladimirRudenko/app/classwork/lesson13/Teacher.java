package VladimirRudenko.app.classwork.lesson13;

/**
 * Created by vladimir on 27.02.17.
 */
public class Teacher extends Person {
   private String subject;
    int room;

    public Teacher(String name){
        super(name);
        this.subject = subject;
    }
    public final String ask (String subject){
        return subject;
    }


}
