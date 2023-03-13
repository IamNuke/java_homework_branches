package task2;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arrayList.add(random.nextInt(100));
        }
        System.out.println(arrayList);
        int max = Collections.max(arrayList);
        int min = Collections.min(arrayList);
        double mean = getAverage(arrayList);
        System.out.printf("Maximum %d; Minimum %d; Arithmetic mean %f", max, min, mean);
    }

    private static double getAverage(ArrayList<Integer> list) {
        long sum = 0;
        for (int i: list) {
            sum += i;
        }
        return list.size() > 0 ? (double) sum / list.size() : 0;
    }


}

