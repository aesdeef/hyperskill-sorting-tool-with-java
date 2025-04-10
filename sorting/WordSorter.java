package sorting;

import java.util.Scanner;
import java.util.regex.Pattern;

public class WordSorter extends Sorter {
    long max_entry_length = -1;
    String longest_entry = null;

    @Override
    public void parse(Scanner scanner) {
        while (scanner.hasNext()) {
            String word = scanner.next();
            entry_count++;
            long entry_length = word.length();
            if (entry_length == max_entry_length) {
                max_entry_count++;
            } else if (entry_length > max_entry_length) {
                longest_entry = word;
                max_entry_length = entry_length;
                max_entry_count = 1;
            }
        }
    }

    @Override
    public void print() {
        System.out.printf(
                """
                        Total words: %d.
                        "The longest word: %s (%d time(s), %.0f%%).""",
                entry_count,
                longest_entry,
                max_entry_count,
                max_entry_count * 100.0 / entry_count
        );
    }
}
