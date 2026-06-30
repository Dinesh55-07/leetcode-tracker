// Last updated: 30/06/2026, 09:22:03
1class Solution {
2    public boolean isHappy(int n) {
3        Set<Integer> visit = new HashSet<>();
4
5        while(!visit.contains(n)){
6            visit.add(n);
7
8            n = getNextNum(n);
9            if (n==1) return true;
10        }
11        return false;
12    }
13
14    public int getNextNum(int n){
15        int output =0;
16
17        while (n > 0){
18            int temp = n % 10;
19            output += temp * temp;
20            n /= 10;
21        }
22
23        return output;
24    } 
25}