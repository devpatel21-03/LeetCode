class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> arr = new ArrayList<>();
        
        // Initialize the list with values from 1 to n
        for (int i = 1; i <= n; i++) {
            arr.add(i);
        }

        int index = 0;

        // Continue eliminating until only one remains
        while (arr.size() > 1) {
            index = (index + k - 1) % arr.size();  // Get the index of the k-th person
            arr.remove(index);  // Remove the k-th person
        }

        return arr.get(0);  // Return the last remaining person
    }
}
