import java.util.HashSet;

public class OptimalPartition {
    public static int partitionString(String s) {
        int partitions = 0;
        HashSet<Character> seen = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (seen.contains(c)) {
                partitions++;  // Start a new partition
                seen.clear();
            }
            seen.add(c);
        }
        
        return partitions + 1; // Count the last partition
    }

    public static void main(String[] args) {
        String s = "abacbc";
        System.out.println("Optimal Partitions: " + partitionString(s)); // Output: 3
    }
}
