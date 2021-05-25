package Lesson3;

public class Test {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Apple a1 = new Apple();
        Apple a2 = new Apple();
        Apple a3 = new Apple();
        Apple a4 = new Apple();

        appleBox.addFruitToBox(a1);
        appleBox.addFruitToBox(a2);
        appleBox.addFruitToBox(a3);
        appleBox.addFruitToBox(a4);

        Box<Orange> orangeBox = new Box<>();
        Orange o1 = new Orange();
        Orange o2 = new Orange();
        Orange o3 = new Orange();

        orangeBox.addFruitToBox(o1);
        orangeBox.addFruitToBox(o2);
        orangeBox.addFruitToBox(o3);


        System.out.println("коробка с яблоками весит " + appleBox.getWeight());
        System.out.println("коробка с апельсинами весит " + orangeBox.getWeight());


        System.out.println("Вес двух ящиков одинаковый? " + appleBox.compare(orangeBox));


        Box<Apple> newAppleBox = new Box<>();
        appleBox.moveFruits(newAppleBox);


        Apple a5 = new Apple();
        newAppleBox.addFruitToBox(a5);

        System.out.println("Когда мы добавляем фрукты, вес коробки с яблоками равен " + newAppleBox.getWeight());
    }

}
