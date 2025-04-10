package sorting;

import java.util.Scanner;

public class LongSorter extends Sorter {
    long max_entry = Long.MIN_VALUE;

    @Override
    public void parse(Scanner scanner) {
        while (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            entry_count++;
            if (number == max_entry) {
                max_entry_count++;
            } else if (number > max_entry) {
                max_entry = number;
                max_entry_count = 1;
            }
        }
    }

    @Override
    public void print() {
        System.out.printf(
                """
                        Total numbers: %d.
                        "The greatest number: %d (%d time(s), %.0f%%).""",
                entry_count,
                max_entry,
                max_entry_count,
                max_entry_count * 100.0 / entry_count
        );
    }
}
