package day03;

import java.util.Arrays;
import java.util.Random;

public class OddArray {
    private Random rnd = new Random();
    private int[] arr = new int[5];

    public int[] createArray() {
        int num;
        for (int i = 0; i < 5; i++) {
            do {
                num = rnd.nextInt();
            }
            while (num % 2 == 0);
            arr[i] = num;
        }
        return arr;
    }

    public static void main(String[] args) {
        OddArray odd = new OddArray();

        System.out.println(Arrays.toString(odd.createArray()));
    }
}
