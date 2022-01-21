package fruitBox;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> fruitBox;

    public Box() {
        this.fruitBox = new ArrayList<>();
    }

    public int getWeight() {
        if (fruitBox.isEmpty()) {
            return 0;
        } else {
            if (fruitBox.get(0) instanceof Apple) {
                return fruitBox.size();
            } else {
                return fruitBox.size() *2;
            }
        }
    }

    public void addFruit(T fruit) {
        fruitBox.add(fruit);
    }

    public boolean compare(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }

    public void pourOverTo(Box<T> resultBox) {
        resultBox.fruitBox.addAll(this.fruitBox);
        this.fruitBox.clear();
    }


//      это был мой первый метод getWeight()

//    public int getWeight() {
//        int weight = 0;
//        if (fruitBox.size() == 0) {
//            return weight;
//        } else {
//            for (int i = 0; i < fruitBox.size(); i++) {
//                weight += fruitBox.get(i).weight;
//            }
//        }
//        return weight;
//    }

}
