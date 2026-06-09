// Last updated: 09/06/2026, 09:25:58
1class Solution {
2    public int calPoints(String[] operations) {
3        Deque<Integer> stack = new ArrayDeque<>();
4
5        for (String x : operations){
6            if(x.equals("+")){
7                int top = stack.pop();
8                int sum = top + stack.peek();
9
10                stack.push(top);
11                stack.push(sum);
12            }else if(x.equals("D")){
13                stack.push(stack.peek() * 2);
14            }else if(x.equals("C")){
15                stack.pop();
16            }else{
17                stack.push(Integer.parseInt(x));
18            }
19        }
20        int sum= 0;
21        while(!stack.isEmpty()){
22            sum += stack.pop();
23        }
24
25        return sum;
26    }
27}