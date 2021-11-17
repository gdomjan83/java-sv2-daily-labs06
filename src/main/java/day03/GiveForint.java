package day03;

public class GiveForint {

    public int roundToForint(int paid) {
        String numString = String.valueOf(paid);
        int lastDigit = Character.getNumericValue(numString.charAt(numString.length() - 1));
        int paidRoundDown = paid - lastDigit;
        int result = 0;

        switch (lastDigit) {
            case 1, 2, 0:
                result = 0;
                break;
            case 3, 4, 5, 6, 7:
                result = 5;
                break;
            case 8, 9:
                result = 10;
                break;
        }
        return paidRoundDown + result;
    }
}
