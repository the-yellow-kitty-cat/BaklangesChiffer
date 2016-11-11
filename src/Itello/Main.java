package Itello;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String b = in.nextLine();
        if (b.equals("")) {
            System.out.println(b);
        } else {
            String encryptionToString = getBackwardsEncryption(b);
            System.out.println(encryptionToString);
        }
    }

    private static String getBackwardsEncryption(String b) {
        StringBuilder encryptedString = new StringBuilder();
        for (int currentLetter = b.length() - 1; currentLetter >= 0; currentLetter--) {
            char currentSymbol=b.charAt(currentLetter);
            encryptedString.append(currentSymbol);
        }
        return encryptedString.toString();
    }
}
