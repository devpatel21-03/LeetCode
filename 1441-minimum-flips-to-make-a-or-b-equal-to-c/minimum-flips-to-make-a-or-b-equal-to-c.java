class Solution {
    public int minFlips(int a, int b, int c) {
        int flips = 0;

        // Check each of the 32 bits
        for (int i = 0; i < 32; i++) {
            int bitA = (a >> i) & 1;
            int bitB = (b >> i) & 1;
            int bitC = (c >> i) & 1;

            if ((bitA | bitB) != bitC) {
                if (bitC == 0) {
                    // Flip each 1 to 0 if needed
                    flips += bitA + bitB;
                } else {
                    // bitC is 1 but both are 0 — need one flip
                    flips += 1;
                }
            }
        }

        return flips;
    }
}
