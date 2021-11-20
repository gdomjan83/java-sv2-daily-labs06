package day04;

import java.util.Scanner;

public class HangmanVersion2 {
    private String word;
    private String status;
    private int tries;
    private boolean wordSolved = false;

    public HangmanVersion2(String word, int tries) {
        this.word = word;
        this.tries = tries;
        this.status = "*".repeat(word.length());
    }

    public void runGame() {
        Scanner sc = new Scanner(System.in);
        String letter;

        while (!wordSolved && (tries > 0)) {
            letter = inputOutput(sc);
            checkLetter(letter);
            tries--;
            if (!status.contains("*")) {
                wordSolved = true;
            }
        }

        if (wordSolved) {
            System.out.println("Gratulálunk, a megoldás valóban: " + word);
        } else {
            System.out.println("Sajnos nincs több lehetőséged.");
        }
    }

    private void checkLetter(String s) {
        char[] statusCharacters = status.toCharArray();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == s.charAt(0)) {
                statusCharacters[i] = s.charAt(0);
            }
        }
        status = new String(statusCharacters);
    }

    private String inputOutput(Scanner scanner) {
        System.out.println("A szó: " + status);
        System.out.println("Még " + tries + " alkalommal próbálkozhatsz.");
        System.out.println("Adj meg egy betűt:");
        return scanner.nextLine();
    }
}