package typeracer;

import java.util.Scanner;

public class TypeRacer {

    public static void main(String args[]) {
        int mistakeCounter = 0;
        double wordsPerMinute = 0;
        String text1 = "The ancient Greeks knew as much about the solar system as we do.";
        Scanner input = new Scanner(System.in);
        System.out.println("Start typing:");
        System.out.println(text1);
        double startTime = System.currentTimeMillis();
        String text2 = input.nextLine();
        double endTime = System.currentTimeMillis();
        double totalTime = (endTime - startTime) / 1000;
        char[] firstText = text1.toCharArray();
        char[] secondText = text2.toCharArray();
        int minLength = Math.min(firstText.length, secondText.length);

        for (int j = 0; j < minLength; j++) {
            if (firstText[j] != secondText[j]) {
                mistakeCounter++;
            }
        }

        wordsPerMinute = (countWords(text1) * 60) / totalTime;
        System.out.println("--------------------------------------");
        System.out.println("You've typed " + countWords(text2) + " words out of " + countWords(text1) + " in " + totalTime + " seconds and made " + mistakeCounter + " mistake(-s).");
        System.out.println("Your typing speed is: " + Math.round(wordsPerMinute) + " words per minute.");
        System.out.println("--------------------------------------");
    }

    public static int countWords(String str) {
        String words[] = str.split(" ");
        int count = words.length;
        return count;
    }
}
