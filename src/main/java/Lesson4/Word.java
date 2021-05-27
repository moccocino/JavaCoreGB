package Lesson4;
import java.util.HashMap;

public class Word {
    public static void main(String[] args) {
        String[] words = {"Кот", "Собака", "Корова", "Лошадь", "Кот", "хомяк", "Корова", "Петух", "Коза", "Курица", "Собака", "Кот"};
        HashMap<String, Integer> wordUniqueWithRepeats = new HashMap<>();

        for (String word : words) {
            if (wordUniqueWithRepeats.containsKey(word)) {
                wordUniqueWithRepeats.put(word, wordUniqueWithRepeats.get(word) + 1);
            } else {
                wordUniqueWithRepeats.put(word, 1);
            }
        }
        System.out.println(wordUniqueWithRepeats);
    }
}
