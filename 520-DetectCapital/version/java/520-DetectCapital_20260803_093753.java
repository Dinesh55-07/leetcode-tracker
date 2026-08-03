// Last updated: 03/08/2026, 09:37:53
1class Solution {
2    public boolean detectCapitalUse(String word) {
3        int uppercaseCount = 0;
4        
5        for (char c : word.toCharArray()) {
6            if (Character.isUpperCase(c)) {
7                uppercaseCount++;
8            }
9        }
10        
11        return uppercaseCount == word.length() || uppercaseCount == 0 || (uppercaseCount == 1 && Character.isUpperCase(word.charAt(0)));
12    }
13}