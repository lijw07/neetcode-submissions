class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int bits = i;
            int counter = 0;
            while (bits != 0) {
                if ((bits & 1) == 1)
                    counter++;
                bits = bits >> 1;
            }

            result[i] = counter;
        }
        return result;
    }
}
