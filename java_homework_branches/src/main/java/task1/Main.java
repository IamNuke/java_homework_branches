package task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arrayList.add(random.nextInt(100));
        }
        System.out.println(arrayList);
        removeTheEven(arrayList);
        System.out.println(arrayList);
    }

    private static void removeTheEven(ArrayList<Integer> arrayList) {
        arrayList.removeIf(x -> x % 2 == 0);
    }
}
