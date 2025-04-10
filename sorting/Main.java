package sorting;

import java.util.*;

public class Main {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        long all_numbers = 0;
        long max_number = Long.MIN_VALUE;
        long max_number_count = 0;

        while (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            all_numbers++;
            if (number == max_number) {
                max_number_count++;
            } else if (number > max_number) {
                max_number = number;
                max_number_count = 1;
            }
        }

        System.out.printf(
                "Total numbers: %d.\n" +
                "The greatest number: %d (%d time(s)).",
                all_numbers,
                max_number,
                max_number_count
        );
    }
}
