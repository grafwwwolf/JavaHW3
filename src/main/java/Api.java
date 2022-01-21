import fruitBox.Apple;
import fruitBox.Box;
import fruitBox.Orange;

import java.util.List;

import static homeworks_methods.MethodsForHomeWork.*;

public class Api {

    public static void main(String[] args) {

        String[] strArr = {"раз", "два", "три", "четыре", "пять"};
        Integer[] intArr = {1, 2, 3, 4, 5};

        List<String> strList = getListFromArray(strArr);
        List<Integer> integerList = getListFromArray(intArr);

        printArray(strArr);
        printArray(intArr);

        swap(strArr, 0, 4);
        swap(intArr, 0, 4);

        printArray(strArr);
        printArray(intArr);

        System.out.println(strList);
        System.out.println(integerList);


        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());

        System.out.println(appleBox.compare(orangeBox));

        Box<Apple> newAppleBox = new Box<>();
        System.out.println(newAppleBox.getWeight());

        appleBox.pourOverTo(newAppleBox);

        System.out.println(appleBox.getWeight());
        System.out.println(newAppleBox.getWeight());

    }


}
