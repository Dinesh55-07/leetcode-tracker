// Last updated: 09/06/2026, 14:43:34
1class Solution {
2    public int[] plusOne(int[] digits) {
3        for (int i = digits.length - 1; i >= 0; i--) {
4	        if (digits[i] < 9) {
5		        digits[i]++;
6		        return digits;
7	        }
8	        digits[i] = 0;
9        }
10
11        digits = new int[digits.length + 1];
12        digits[0] = 1;
13        return digits;
14    }
15}