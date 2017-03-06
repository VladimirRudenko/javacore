package VladimirRudenko.app.homework.lesson15;

/**
 * Created by vladimir on 06.03.17.
 */
public abstract class Bicycle {
    public void ride(){
        System.out.println("Wroom!");
    }
    public abstract void setSpeed(int speed);
    public abstract void setGear(String gear);
}
