// Last updated: 05/06/2026, 21:20:42
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        Map <String,List<String>> map = new HashMap<>();
4
5        for (String word : strs){
6            char chars[] = word.toCharArray();
7
8            Arrays.sort(chars);
9
10            String sorted = new String(chars);
11
12            if (!map.containsKey(sorted)){
13                map.put(sorted,new ArrayList<>());
14            }
15
16            map.get(sorted).add(word);
17        }
18
19        return new ArrayList<>(map.values());
20    }
21}