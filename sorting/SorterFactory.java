package sorting;

import java.util.Arrays;

public class SorterFactory {
    public static Sorter of(String[] args) {
        return switch (determineType(args)) {
            case SorterType.LONG -> new LongSorter();
            case SorterType.LINE -> new LineSorter();
            case SorterType.WORD -> new WordSorter();
        };
    }

    private static SorterType determineType(String[] args) {
        int index = Arrays.stream(args).toList().indexOf("-dataType");
        if (index >= 0 && index < args.length - 1) {
            return switch (args[index + 1]) {
                case "long" -> SorterType.LONG;
                case "line" -> SorterType.LINE;
                default -> SorterType.WORD;
            };
        }
        return SorterType.WORD;
    }
}
