package task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        workWithLinkedList();
    }


    private static void workWithLinkedList() {
        Scanner in = new Scanner(System.in);
        LinkedList<String> wordsList = new LinkedList<>();

        while (true) {
            System.out.println();
            System.out.print("Введите строку или команду: ");
            String inputString = in.nextLine();

            switch (inputString.toUpperCase()){
                case "PRINT":
                    List<String> tmp = new LinkedList<>();
                    tmp.addAll(wordsList);
                    Collections.reverse(tmp);
                    System.out.println(tmp);
                    tmp.clear();
                    break;
                case "REVERT":
                    wordsList.removeLast();
                    break;
                case "STOP":
                    return;
                default:
                    if (inputString.isBlank()) {
                        System.out.println("Строка не должна быть пустой");
                        continue;
                    }
                    wordsList.add(inputString);
            }
        }
    }
}

