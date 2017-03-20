package VladimirRudenko.runners;

import VladimirRudenko.app.homework.lesson11.InputOutputArray;

/**
 * Created by vladimir on 23.02.17.
 */
public class Lesson11Runner {
    public static void main(String[] args) {
        InputOutputArray inputOutputArray = new InputOutputArray();
        inputOutputArray.writeFile(inputOutputArray.sortArray(inputOutputArray.stringToIntArray(inputOutputArray.readFile())));
    }
}
