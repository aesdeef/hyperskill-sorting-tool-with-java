package sorting;

import java.util.*;

public class Main {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sorter sorter = SorterFactory.of(args);
        sorter.parse(scanner);
        sorter.print();
    }
}
