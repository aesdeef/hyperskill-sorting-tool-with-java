package sorting;

import java.util.Scanner;

public class LineSorter extends Sorter {
    long max_entry_length = -1;
    String longest_entry = null;

    @Override
    public void parse(Scanner scanner) {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            entry_count++;
            long entry_length = line.length();
            if (entry_length == max_entry_length) {
                max_entry_count++;
            } else if (entry_length > max_entry_length) {
                longest_entry = line;
                max_entry_length = entry_length;
                max_entry_count = 1;
            }
        }
    }

    @Override
    public void print() {
        System.out.printf(
                """
                        Total lines: %d.
                        The longest line:
                        %s
                        (%d time(s), %.0f%%).""",
                entry_count,
                longest_entry,
                max_entry_count,
                max_entry_count * 100.0 / entry_count
        );
    }
}
