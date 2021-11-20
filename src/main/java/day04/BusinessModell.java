package day04;

import java.util.Scanner;

public class BusinessModell {
    private String wordToFind;
    private String lettersFound;
    private int tries;
    private boolean wordSolved;

    public BusinessModell(String wordToFind, int tries) {
        this.wordToFind = wordToFind;
        this.tries = tries;
        this.lettersFound = "*".repeat(wordToFind.length());
    }

    public String getWordToFind() {
        return wordToFind;
    }

    public String getLettersFound() {
        return lettersFound;
    }

    public int getTries() {
        return tries;
    }

    public boolean isWordSolved() {
        return wordSolved;
    }

    public State isGameRunning() {
        if (!wordSolved && tries > 0) {
            return State.RUNNING;
        }
        return State.END;
    }

    public void setWordSolved() {
        wordSolved = wordToFind.equals(lettersFound);
    }

    public State checkGuess(String guess) {
        if (wordToFind.contains(guess)) {
            updateLetter(guess);
            return State.SUCCESS;
        } else {
            tries--;
            return State.FAILED;
        }
    }

    public State takeGuess(Scanner sc) {
        String userGuess = sc.nextLine();
        if (wordToFind.equals(userGuess)) {
            return State.SUCCESS;
        }
        return State.FAILED;
    }

    private void updateLetter(String s) {
        char[] statusCharacters = lettersFound.toCharArray();
        for (int i = 0; i < wordToFind.length(); i++) {
            if (wordToFind.charAt(i) == s.charAt(0)) {
                statusCharacters[i] = s.charAt(0);
            }
        }
        lettersFound = new String(statusCharacters);
    }
}
