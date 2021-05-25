package Lesson3;
import java.util.ArrayList;

public class Box<F extends Fruit>{

    private ArrayList<F> packOfFruits;

    private float boxWeight;

    public Box() {
        packOfFruits = new ArrayList<>();
    }


    public float getWeight() {

        if (packOfFruits.size() != 0) {
            int i = 0;
            boxWeight = packOfFruits.size() * packOfFruits.get(i).onePieceWeight();
        } else {
            System.out.println("Ящик пуст");
        }
        return boxWeight;
    }

    public boolean compare(Box<?> secondBox) {
        return getWeight() == secondBox.getWeight();
    }


    public void moveFruits(Box<F> secondBox) {
        secondBox.packOfFruits.addAll(this.packOfFruits);
        packOfFruits.clear();
    }

    public void addFruitToBox(F addedFruit) {
        packOfFruits.add(addedFruit);
    }
}
