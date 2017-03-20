package VladimirRudenko.app.classwork.lesson12;

/**
 * Created by vladimir on 23.02.17.
 */
public class Student {
    private String response = "class";
    private String name = "Vasya";
    private int balu = 40;

    public int getBalu() {
        return balu;
    }
    public String getName(){
        return  name;
    }

    public void setResponse(String test) {

        this.response = test;
    }
    public void setName(String name){
        this.name = name;
    }
    {
        System.out.println(balu);
        //System.out.println(name);
    }
}
