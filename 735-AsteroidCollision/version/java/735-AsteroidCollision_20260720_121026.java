// Last updated: 20/07/2026, 12:10:26
1class Solution {
2    public int[] asteroidCollision(int[] asteroids) {
3        Stack<Integer> stack = new Stack<>();
4        
5        for (int a : asteroids) {
6            if (a > 0) {
7                stack.push(a);
8            } else {
9                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -a) {
10                    stack.pop();
11                }
12
13                if (stack.isEmpty() || stack.peek() < 0)  {
14                    stack.push(a);
15                }
16
17                if (stack.peek() == -a) {
18                    stack.pop();
19                }
20            }
21        }
22
23        int[] res = new int[stack.size()];
24        int i = stack.size() - 1;
25
26        while(!stack.isEmpty()) {
27            res[i--] = stack.pop();
28        }
29
30        return res;   
31    }
32}