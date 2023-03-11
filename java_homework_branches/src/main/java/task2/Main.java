package task2;

import java.io.FileWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Enter word:");
        Scanner input = new Scanner(System.in);
        String word = input.next();
        String text = repeatWord(word);
        try {
            FileWriter textFile = new FileWriter("textFile.txt");
            textFile.write(text);
            textFile.flush();
        }catch (Exception e){
            System.out.println("Error");
        }

    }
    private static String repeatWord(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <100 ; i++) {
            sb.append(word);
        }
        return  sb.toString();
    }
}