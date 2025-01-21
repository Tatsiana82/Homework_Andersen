package lesson_13;

import java.util.*;
//Task_1
public class UniqueWords {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Python");
        arr.add("Ruby");
        arr.add("Java");
        arr.add("PHP");
        arr.add("JavaScript");
        arr.add("Fortran");
        arr.add("Scala");
        arr.add("Go");
        arr.add("Kotlin");
        arr.add("C Sharp");
        arr.add("Fortran");
        arr.add("Java");
        arr.add("Delphi");
        arr.add("Groovy");
        arr.add("Go");

        Set<String> uniqueWords = new HashSet<>(arr);
        System.out.println("Unique words: " + uniqueWords);

        Map<String, Integer> wordsCount = new HashMap<>();
        for (String words : arr) {
            if (wordsCount.containsKey(words)) {
                wordsCount.put(words, wordsCount.get(words) + 1);
            } else {
                wordsCount.put(words, 1);
            }
        }
        System.out.println("Number of repetitions of each word:");
        for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());

        }
    }
}