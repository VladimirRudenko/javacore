package VladimirRudenko.app.classwork.lesson7;

import java.util.Arrays;

/**
 * Created by vladimir on 09.02.17.
 */
public class someSort {
    public static void main(String[] args) {
        int[] someArray = {1, 5, 7, 2, 0};
        Arrays.sort(someArray);
        {
            System.out.println("Sorted array :" + Arrays.toString(someArray));
        }

    }
}




 /*   public static void main(String[] args) {
        char[] charArr = new char[256];
        for (int i = 0; i < charArr.length; i++)
        {
        charArr [i] = (char) i;
        }
        {
            System.out.println("Sorted array \n"
                    + Arrays.toString(charArr));
        }
    }
}*/