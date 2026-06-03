// Last updated: 03/06/2026, 14:02:45
1
2class Solution 
3{
4    public boolean wordBreak(String s, List<String> wordDict) 
5    {
6        boolean dp[] = new boolean[s.length() + 1];
7
8        dp[0] = true;
9
10        for(int i = 1; i <= s.length(); i++)
11        {
12            for(String word : wordDict)
13            {
14                int len = word.length();
15
16                if(i >= len && dp[i - len])
17                {
18                    if(s.substring(i - len, i).equals(word))
19                    {
20                        dp[i] = true;
21                        break;
22                    }
23                }
24            }
25        }
26        return dp[s.length()];
27    }
28}