// Last updated: 13/07/2026, 09:51:41
1
2
3class RandomizedSet {
4    private ArrayList<Integer> list;
5    private Map<Integer, Integer> map;
6
7    public RandomizedSet() {
8        list = new ArrayList<>();
9        map = new HashMap<>();
10    }
11
12    public boolean search(int val) {
13        return map.containsKey(val);
14    }
15
16    public boolean insert(int val) {
17        if (search(val)) return false;
18
19        list.add(val);
20        map.put(val, list.size() - 1);
21        return true;
22    }
23
24    public boolean remove(int val) {
25        if (!search(val)) return false;
26
27        int index = map.get(val);
28        list.set(index, list.get(list.size() - 1));
29        map.put(list.get(index), index);
30        list.remove(list.size() - 1);
31        map.remove(val);
32
33        return true;
34    }
35
36    public int getRandom() {
37        Random rand = new Random();
38        return list.get(rand.nextInt(list.size()));
39    }
40}
41
42