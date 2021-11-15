package day01;

import java.util.ArrayList;
import java.util.List;

public class PositiveNumberContainer {
    private List<Integer> numbers = new ArrayList<>();

    public void add(Integer number) {
        numbers.add(number);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Integer num : numbers) {
            sb.append(num + " ");
        }
        return new String(sb);
    }
}
