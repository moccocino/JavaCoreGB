package Lesson2correct;

public class HomeWorkMassiv {
    public static int arraySum(String[][] array) throws MyArraySizeException, MyArrayDataException {
        for (int i = 0; i < 4; i++) {
            if (array.length != 4 || array[i].length != 4)
                throw new MyArraySizeException();
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try {
                    sum = sum + Integer.parseInt(array[i][j]);
                } catch (NumberFormatException exception) {
                    throw new MyArrayDataException("Ошибка в элементах массива [" + i + "], [" + j + "]");
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        String[][] firstArray = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };


        String[][] secondArray = {
                {"1", "1"},
                {"1", "1"},
                {"1", "1"},
        };


        String[][] thirdArray = {
                {"a", "a", "a", "a"},
                {"a", "a", "a", "a"},
                {"a", "a", "a", "a"},
                {"a", "a", "a", "a"}
        };

            System.out.println(arraySum(firstArray));
            System.out.println(arraySum(secondArray));
            System.out.println(arraySum(thirdArray));
    }
}

