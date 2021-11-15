package day01;

import java.util.ArrayList;
import java.util.List;

public class PositiveNumberContainer {
    private List<Double> numbers = new ArrayList<>();

    public void add(Double number) {
        numbers.add(number);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Double num : numbers) {
            sb.append(num + " ");
        }
        return new String(sb);
    }
}
