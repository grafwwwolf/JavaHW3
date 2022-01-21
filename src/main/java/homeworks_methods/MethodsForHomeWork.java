package homeworks_methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsForHomeWork {
    // метод к заданию 1
    public static <T> void swap(T[] array, int firstIndex, int secondIndex) {
        T object = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = object;
    }

    //Заодно уж и метод печати для любых массивов)))
    public static <T> void printArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ". ");
        }
        System.out.println();
    }

    //    метод к заданию 2
    public static <T> List<T> getListFromArray(T[] array) {
        return new ArrayList<T>(Arrays.asList(array));
    }

}
