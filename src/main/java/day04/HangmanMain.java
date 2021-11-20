package day04;

public class HangmanMain {
    public static void main(String[] args) {
        Hangman hangman = new Hangman("automata", 10);

        hangman.runGame();
    }
}
