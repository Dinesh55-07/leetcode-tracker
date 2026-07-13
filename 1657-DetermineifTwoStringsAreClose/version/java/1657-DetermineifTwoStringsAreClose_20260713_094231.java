// Last updated: 13/07/2026, 09:42:31
1class Solution {
2    public boolean closeStrings(String word1, String word2) {
3        int[] freq1 = new int[26];
4        int[] freq2 = new int[26];
5
6        for (char ch : word1.toCharArray()) {
7            freq1[ch - 'a']++;
8        }
9
10        for (char ch : word2.toCharArray()) {
11            freq2[ch - 'a']++;
12        }
13
14        for (int i = 0; i < 26; i++) {
15            if ((freq1[i] == 0 && freq2[i] != 0) || (freq1[i] != 0 && freq2[i] == 0)) {
16                return false;
17            }
18        }
19
20        Arrays.sort(freq1);
21        Arrays.sort(freq2);
22
23        for (int i = 0; i < 26; i++) {
24            if (freq1[i] != freq2[i]) {
25                return false;
26            }
27        }
28
29        return true;
30    }
31}
32