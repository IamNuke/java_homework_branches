package task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter word:");
        Scanner input = new Scanner(System.in);
        String word = input.next();
        if (isPalindrome(word)) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }

    }

    private static boolean isPalindrome(String word) {

        for (int i = 0; i < word.length()/2; i++) {
            if (word.charAt(i) != word.charAt(word.length()-i-1)){
                return false;
            }
        }
        return true;
    }


}

