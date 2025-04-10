package sorting;

import java.util.Scanner;

public abstract class Sorter {
    long entry_count = 0;
    long max_entry_count = 0;

    public abstract void parse(Scanner scanner);
    public abstract void print();
}
