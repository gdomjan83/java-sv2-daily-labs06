package day04;

import java.util.Scanner;

public class HangmanMain {
    public void runGame() {
        BusinessModell businessModell = new BusinessModell("kutya", 5);
        Scanner sc = new Scanner(System.in);

        while (businessModell.isGameRunning() == State.RUNNING) {
            printStatus(businessModell.getLettersFound(), businessModell.getTries());
            String letter = sc.nextLine();

            if (businessModell.checkGuess(letter) == State.SUCCESS) {
                System.out.println("Helyes tipp!");
            } else {
                System.out.println("Rossz tipp.");
            }
            businessModell.setWordSolved();
        }
        endingGame(businessModell, sc);
    }

    private void printStatus(String status, int tries) {
        System.out.println("A szó: " + status);
        System.out.println("Még " + tries + " alkalommal próbálkozhatsz.");
        System.out.println("Adj meg egy betűt:");
    }

    private void endingGame(BusinessModell businessModell, Scanner sc) {

        if (businessModell.isWordSolved()) {
            System.out.println("Gratulálunk, a megoldás valóban: " + businessModell.getWordToFind());
        } else {
            System.out.println("Melyik szóra gondoltunk?");

            if (businessModell.takeGuess(sc) == State.SUCCESS) {
                System.out.println("Gratulálunk, a megoldás valóban: " + businessModell.getWordToFind());
            } else {
                System.out.println("Sajnos nem jól tippeltél.");
            }
        }
    }

    public static void main(String[] args) {
        new HangmanMain().runGame();
    }
}
