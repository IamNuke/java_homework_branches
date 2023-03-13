package task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("asd");
        arrayList.add("4");
        arrayList.add("1.2");
        arrayList.add("dfg");
        arrayList.add("3");
        arrayList.add("1");
        System.out.println(arrayList);
        removeInteger(arrayList);
        System.out.println(arrayList);
    }

    private static void removeInteger(ArrayList<String> arrayList) {
        int num;
        for (int i = 0; i < arrayList.size(); i++) {
            try {
                num = Integer.parseInt(arrayList.get(i));
                arrayList.remove(i);
                i--;

            }catch (Exception e){
                System.out.println(arrayList.get(i) + " not an integer.");
            }
        }

    }
}