package VladimirRudenko.app.classwork.lesson12;

/**
 * Created by vladimir on 23.02.17.
 */
public class Bicycle {
    private int size;
    private String color;
    public Bicycle(int size, String color){
        this.color = color;
        this.size = size;
    }
    public Bicycle(int size){
        this();
        this.size = size;
    }
    public Bicycle(){
        this.size = 34;
        this.color = "red";
    }
    public Bicycle(String color){
        this();
        this.color=color;
    }

}
