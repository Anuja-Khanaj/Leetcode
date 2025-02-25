import java.util.*;

public class ValidateBinaryTreeNodes {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 4;
        int[] leftChild = {1, -1, 3, -1};
        int[] rightChild = {2, -1, -1, -1};

        System.out.println(sol.validateBinaryTreeNodes(n, leftChild, rightChild)); // Output: true
    }
}

class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int[] inDegree = new int[n];

        // Count the in-degree of each node
        for (int i = 0; i < n; i++) {
            if (leftChild[i] != -1) {
                inDegree[leftChild[i]]++;
            }
            if (rightChild[i] != -1) {
                inDegree[rightChild[i]]++;
            }
        }

        // Find the root (a node with in-degree 0)
        int root = -1;
        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0) {
                if (root == -1) {
                    root = i; // Assign the first root
                } else {
                    return false; // More than one root found
                }
            }
        }

        if (root == -1) return false; // No root found (cycle or multiple parents issue)

        // Perform BFS or DFS to check if all nodes are reachable from root
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            if (!visited.add(node)) return false; // Cycle detected

            if (leftChild[node] != -1) queue.offer(leftChild[node]);
            if (rightChild[node] != -1) queue.offer(rightChild[node]);
        }

        return visited.size() == n; // Ensure all nodes are connected
    }
}
