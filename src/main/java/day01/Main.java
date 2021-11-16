package day01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PositiveNumberContainer container = new PositiveNumberContainer();

        System.out.println("Adj meg pozitív egész számokat, enterrel elválasztva.");

        double number;
        boolean positive = true;
            
        while (positive) {
            number = sc.nextDouble();
            if (number > 0) {
                container.add(number);
            } else {
                positive = false;
            }
        }
        System.out.println(container.toString());
    }
}
