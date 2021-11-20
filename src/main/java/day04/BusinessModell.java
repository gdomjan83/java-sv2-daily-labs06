package day04;

import java.util.Scanner;

public class BusinessModell {
    private String word;
    private String status;
    private int tries;
    private boolean wordSolved;

    public BusinessModell(String word, int tries) {
        this.word = word;
        this.tries = tries;
        this.status = "*".repeat(word.length());
    }

    public String getWord() {
        return word;
    }

    public String getStatus() {
        return status;
    }

    public int getTries() {
        return tries;
    }

    public boolean isWordSolved() {
        return wordSolved;
    }

    public boolean isGameRunning() {
        if (!wordSolved && tries > 0) {
            return true;
        }
        return false;
    }

    public void setWordSolved() {
        wordSolved = word.equals(status);
    }

    public boolean checkGuess(String guess) {
        if (word.contains(guess)) {
            updateLetter(guess);
            return true;
        } else {
            tries--;
            return false;
        }
    }

    private void updateLetter(String s) {
        char[] statusCharacters = status.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == s.charAt(0)) {
                statusCharacters[i] = s.charAt(0);
            }
        }
        status = new String(statusCharacters);
    }

    public boolean takeGuess(Scanner sc) {
        String userTry = sc.nextLine();
        if (word.equals(userTry)) {
            return true;
        }
        return false;
    }
}
