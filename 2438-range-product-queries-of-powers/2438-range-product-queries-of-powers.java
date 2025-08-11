class Solution {
    public int[] productQueries(int n, int[][] queries) {
        int MOD = 1_000_000_007;
        List<Integer> powers = new ArrayList<>();

        // Extract powers of 2 from binary representation
        for (int i = 0; i <= 31; i++) {
            if (((n >> i) & 1) == 1) {
                powers.add(1 << i);
            }
        }

        int[] result = new int[queries.length];

        for (int q = 0; q < queries.length; q++) {
            int start = queries[q][0];
            int end = queries[q][1];
            long product = 1;

            for (int i = start; i <= end; i++) {
                product = (product * powers.get(i)) % MOD;
            }

            result[q] = (int) product;
        }

        return result;
    }
}