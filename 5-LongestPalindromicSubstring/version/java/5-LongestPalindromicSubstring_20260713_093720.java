// Last updated: 13/07/2026, 09:37:20
1public class Solution {
2    public String longestPalindrome(String s) {
3        if (s.length() <= 1) {
4            return s;
5        }
6
7        String maxStr = s.substring(0, 1);
8
9        for (int i = 0; i < s.length() - 1; i++) {
10            String odd = expandFromCenter(s, i, i);
11            String even = expandFromCenter(s, i, i + 1);
12
13            if (odd.length() > maxStr.length()) {
14                maxStr = odd;
15            }
16            if (even.length() > maxStr.length()) {
17                maxStr = even;
18            }
19        }
20
21        return maxStr;
22    }
23
24    private String expandFromCenter(String s, int left, int right) {
25        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
26            left--;
27            right++;
28        }
29        return s.substring(left + 1, right);
30    }
31}