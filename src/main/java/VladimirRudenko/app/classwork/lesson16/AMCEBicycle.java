package VladimirRudenko.app.classwork.lesson16;

/**
 * Created by vladimir on 09.03.17.
 */
public class AMCEBicycle implements Bicycle {
    int speed = 1;
    int cadence = 0;
    int gear =1;

    @Override
    public void changeCadence(int newValue) {
        this.cadence = newValue;

    }

    @Override
    public void changeGear(int newValue) {
        this.gear= newValue;

    }
    public void printStates(){
        System.out.println(cadence + speed + gear);
    }
}
