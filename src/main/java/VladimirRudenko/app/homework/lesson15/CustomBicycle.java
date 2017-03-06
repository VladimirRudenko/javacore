package VladimirRudenko.app.homework.lesson15;

/**
 * Created by vladimir on 06.03.17.
 */
public class CustomBicycle extends Bicycle {
   private int speed;
    private String gear;
    @Override
    public void setSpeed(int speed){
        this.speed = speed;
        System.out.println(speed);
    }

    @Override
    public void setGear(String gear) {
        this.gear = gear;
        System.out.println(gear);
    }
   }
