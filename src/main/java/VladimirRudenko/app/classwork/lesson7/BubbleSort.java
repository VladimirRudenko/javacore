
package VladimirRudenko.app.classwork.lesson7;



public class BubbleSort {
    public int[] baubleSortSmallToBig1(int[] array) {
        boolean status = true;
        do {
            status = false;
            for (int i = 0; i < (array.length - 1); i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    status = true;
                }
            }
        } while (status);
        return array;
    }
}


