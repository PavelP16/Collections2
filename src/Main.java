import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println("Нечетные числа:");
        printOddNumbers(nums);

        System.out.println("\nЗадача 2");
        System.out.println("Четные числа без повторений:");
        printEvenNumbersUniqueSorted(nums);

        System.out.println("\nЗадача 3");
        List<String> words = new ArrayList<>(List.of("один", "два", "три", "два", "один", "четыре", "три"));
        System.out.println("Уникальные слова:");
        printUniqueWords(words);

        System.out.println("\nЗадача 4");
        System.out.println("Количество дублей для каждого слова:");
        countWordDuplicates(words);
    }

    // Метод для печати нечетных чисел
    private static void printOddNumbers(List<Integer> nums) {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    // Метод для печати четных чисел без повторений в порядке возрастания
    private static void printEvenNumbersUniqueSorted(List<Integer> nums) {
        Set<Integer> evenNumbersSet = new HashSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                evenNumbersSet.add(num);
            }
        }
        List<Integer> sortedEvenNumbers = new ArrayList<>(evenNumbersSet);
        Collections.sort(sortedEvenNumbers);
        for (Integer evenNum : sortedEvenNumbers) {
            System.out.println(evenNum);
        }
    }

    // Метод для печати уникальных слов
    private static void printUniqueWords(List<String> words) {
        Set<String> uniqueWordsSet = new HashSet<>(words);
        for (String word : uniqueWordsSet) {
            System.out.println(word);
        }
    }

    // Метод для печати количества дублей для каждого слова
    private static void countWordDuplicates(List<String> words) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}