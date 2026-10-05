class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(0);
            } else {
                int x = stack.pop();

                if (x == 0) {
                    x = 1;
                } else {
                    x = 2 * x;
                }

                stack.push(stack.pop() + x);
            }
        }

        return stack.pop();
    }
}