package VladimirRudenko.runners;

import VladimirRudenko.app.homework.lesson15.BicycleWithRing;
import VladimirRudenko.app.homework.lesson15.BicycleWithRingInterface;
import VladimirRudenko.app.homework.lesson15.CustomBicycle;

/**
 * Created by vladimir on 06.03.17.
 */
public class Lesson15Runner {
    public static void main(String[] args) {
        BicycleWithRingInterface bicycleWithRingInterface = new BicycleWithRing();
        bicycleWithRingInterface.ring();

        CustomBicycle vi = new CustomBicycle();
        vi.setSpeed(60);
        vi.setGear("auto");
        vi.ride();
    }
}
