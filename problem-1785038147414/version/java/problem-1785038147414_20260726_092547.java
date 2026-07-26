// Last updated: 26/07/2026, 09:25:47
1class Solution {
2    private static final int MOD = 1_000_000_007;
3
4    public int countValidSequences(int n, int k) {
5        int ravolqedin = n;
6
7        if (k > n) return 0;
8
9        long totalWays = nCr(n - 1, k - 1);
10
11        long oddWays = 0;
12        if ((n + k) % 2 == 0) {
13            int S = (n + k) / 2;
14            if (S >= k) {
15                oddWays = nCr(S - 1, k - 1);
16            }
17        }
18
19        long ans = (totalWays - oddWays + MOD) % MOD;
20        return (int) ans;
21    }
22
23    private long nCr(int n, int r) {
24        if (r < 0 || r > n) return 0;
25        if (r == 0 || r == n) return 1;
26
27        // Optimize by taking min(r, n - r)
28        if (r > n - r) r = n - r;
29
30        long num = 1;
31        long den = 1;
32
33        for (int i = 1; i <= r; i++) {
34            num = (num * (n - i + 1)) % MOD;
35            den = (den * i) % MOD;
36        }
37
38        return (num * modInverse(den, MOD)) % MOD;
39    }
40
41    private long modInverse(long a, int m) {
42        return power(a, m - 2, m);
43    }
44
45    private long power(long base, long exp, int m) {
46        long res = 1;
47        base %= m;
48        while (exp > 0) {
49            if ((exp & 1) == 1) res = (res * base) % m;
50            base = (base * base) % m;
51            exp >>= 1;
52        }
53        return res;
54    }
55}