import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class UnionOfSets {

    public static void main(String[] args) {
        // Example usage
        List<Set<String>> sets = List.of(
                Set.of("A", "B"),
                Set.of("D"),
                Set.of("1", "3", "5")
        );

        Set<String> unionSet = sets.stream()
                .reduce(new HashSet<>(), (set1, set2) -> {
                    set1.addAll(set2);  // Merging two sets
                    return set1;  // Returning the result of the merge
                });
        System.out.println(unionSet);  // Output: [A, B, D, 1, 3, 5]
    }
}

