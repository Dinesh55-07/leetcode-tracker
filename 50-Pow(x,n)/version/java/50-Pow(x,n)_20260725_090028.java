// Last updated: 25/07/2026, 09:00:28
1class Solution {
2    public double myPow(double x, int n) {
3        long temp = n;
4
5        if (temp < 0){
6            return 1.0 / power(x, -temp);
7        }
8        return power(x, temp);
9    }
10
11    public static double power(double x, long n){
12        if (n == 0) return 1.0;
13        if (n == 1) return x;
14
15        if (n % 2 == 0){
16            return power(x*x, n/2);
17        }
18        return x * power(x,n-1);
19    }
20}