package VladimirRudenko.app.classwork.lesson13;

/**
 * Created by vladimir on 27.02.17.
 */
public class Student extends Person{
    private String university;
    private String response = "Ehhh, what was the question?";

    public Student(String name,String university){
        super(name);
        this.university = university;
    }
}
