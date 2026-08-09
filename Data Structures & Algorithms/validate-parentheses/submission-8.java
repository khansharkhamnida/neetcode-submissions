class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        
        for (char c : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } 
            // Handle closing brackets
            else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') return false;
            } 
            else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') return false;
            } 
            else if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') return false;
            }
        }
        
        // If the stack is empty, all brackets were matched correctly
        return stack.isEmpty();
    }
}
