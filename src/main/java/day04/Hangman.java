package day04;

import java.util.Scanner;

public class Hangman {
    private String word;
    private boolean[] lettersFound;
    private boolean wordSolved = false;
    private int tries;

    public Hangman(String word, int tries) {
        this.word = word;
        this.lettersFound = new boolean[word.length()];
        this.tries = tries;
    }

    public void runGame() {
        Scanner sc = new Scanner(System.in);
        String letter;

        while (!wordSolved && (tries > 0)) {
            letter = inputOutput(sc);
            tries--;
            checkLetter(letter);
            wordSolved = isAllFound();
        }

        if (wordSolved) {
            System.out.println("Gratulálunk, a megoldás valóban: " + word);
        } else {
            System.out.println("Sajnos nincs több lehetőséged.");
        }
    }

    private String inputOutput(Scanner scanner) {
        System.out.println("A szó: " + showWord());
        System.out.println("Még " + tries + " alkalommal próbálkozhatsz.");
        System.out.println("Adj meg egy betűt:");
        return scanner.nextLine();
    }

    private void checkLetter(String s) {
        for (int i = 0; i < word.length(); i++) {
            if (word.toCharArray()[i] == s.charAt(0)) {
                lettersFound[i] = true;
            }
        }
    }

    private boolean isAllFound() {
        for (Boolean actual : lettersFound) {
            if (!actual) {
                return false;
            }
        }
        return true;
    }

    private String showWord() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (lettersFound[i]) {
                sb.append(word.charAt(i));
            } else {
                sb.append('*');
            }
        }
        return new String(sb);
    }
}
