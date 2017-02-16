package VladimirRudenko.app.classwork.lesson9;

import java.util.Arrays;

/**
 * Created by vladimir on 13.02.17.
 */
public class RandomString {
    public static void main(String[] args) {


        String stringToDisplay = "";
        char[] arr =  {'c','b','c','r','e'};
        for (int i = 0; i < arr.length; i++) {
            stringToDisplay += arr[i];
        }
        {
            System.out.println(stringToDisplay);
        }

    }
}
