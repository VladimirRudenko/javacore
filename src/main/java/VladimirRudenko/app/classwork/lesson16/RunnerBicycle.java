package VladimirRudenko.app.classwork.lesson16;

import static VladimirRudenko.app.classwork.lesson16.Bicycle.MODEL;

/**
 * Created by vladimir on 09.03.17.
 */
public class RunnerBicycle {
    public static void main(String[] args) {
        Bicycle bicycle = new AMCEBicycle();
        bicycle.changeGear(2);
        bicycle.changeCadence(54);


        AMCEBicycle amceBicycle = new AMCEBicycle();
        amceBicycle.changeGear(3);
        amceBicycle.printStates();
        System.out.println(MODEL);
    }


    public void managerAllBicycle(Bicycle bicycle, int gear){
        bicycle.changeGear(gear);
    }
}
