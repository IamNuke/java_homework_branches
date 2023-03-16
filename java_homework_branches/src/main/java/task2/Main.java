package task2;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> wordsList = new LinkedList<>();
        wordsList.add("string1");
        wordsList.add("string2");
        wordsList.add("string3");
        wordsList.add("string4");
        wordsList.add("string5");
        System.out.println("Source list:");
        System.out.println(wordsList);
        LinkedList<String> revers = new LinkedList<>();
        revers = reversList(wordsList);
        System.out.println("Revers list:");
        System.out.println(revers);
    }

    private static LinkedList<String> reversList(LinkedList<String> sourceList) {
        LinkedList<String> newList = new LinkedList<>();
        newList.addAll(sourceList);
        Collections.reverse(newList);
        return newList;
    }
}