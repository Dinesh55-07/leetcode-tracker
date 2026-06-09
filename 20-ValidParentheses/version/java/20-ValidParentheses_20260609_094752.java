// Last updated: 09/06/2026, 09:47:52
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> stack = new Stack<>();
4
5        for (int i=0; i<s.length(); i++){
6            char ch = s.charAt(i);
7
8            if(ch=='(' || ch=='[' || ch=='{'){
9                stack.push(ch);
10            }
11            else{
12                if(stack.isEmpty()) return false;
13
14                if ((stack.peek() == '(' && ch == ')') || (stack.peek() == '[' && ch == ']') || (stack.peek()=='{' && ch =='}')){
15                    stack.pop();
16                }
17                else{
18                    return false;
19                }
20            }
21            
22        }
23        return stack.isEmpty();
24    }
25}