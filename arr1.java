import java.util.*;

public class arr1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String series = scanner.next();

        int minOperations = getMinOperations(series);
        System.out.println(minOperations);
    }

    private static int getMinOperations(String series) {
        int count = 0;
        Set<Character> visited = new HashSet<>();

        for (int i = 0; i < series.length(); i++) {
            char node = series.charAt(i);

            if (!visited.contains(node)) {
                visited.add(node);
                count++;
            }
        }

        return count;
    }
}