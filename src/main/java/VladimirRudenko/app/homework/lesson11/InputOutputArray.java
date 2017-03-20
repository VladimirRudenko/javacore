package VladimirRudenko.app.homework.lesson11;

import java.io.*;
import java.util.Arrays;

/**
 * Created by vladimir on 23.02.17.
 */
public class InputOutputArray {

    private final String InputOutputArray = "src/test/resources/ArraySort";
    private final String OutputArraySort = "src/test/resources/outputArraySort";

    public String readFile() {
        StringBuilder sb = new StringBuilder();
        String line = "";
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader(InputOutputArray));
            while ((line = reader.readLine()) != null) {
                if (!line.equals(null) || !line.isEmpty())
                    sb.append(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public void writeFile(int[] array) {
        String result = "";
        try {
            BufferedWriter writer = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(OutputArraySort)));
            writer.write(Arrays.toString(array));
            writer.newLine();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public int[] stringToIntArray(String input) {
        String[] stringArray = input
                .replaceAll("[\\s|\\[|\\]|\\{|\\}]", "")
                .trim()
                .split(",");
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        return intArray;
    }

    public int[] sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }
}
