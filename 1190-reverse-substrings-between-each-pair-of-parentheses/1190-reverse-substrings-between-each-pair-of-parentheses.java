class Solution {
    public String reverseParentheses(String s) {

        Stack<String> stack = new Stack<>();
        StringBuilder current = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(') {

                // Current string ko save karo
                stack.push(current.toString());

                // New substring start
                current = new StringBuilder();

            } 
            else if (ch == ')') {

                // Current substring reverse karo
                current.reverse();

                // Previous string nikalo
                String previous = stack.pop();

                // Previous + reversed current
                current = new StringBuilder(previous + current);

            } 
            else {

                // Normal character
                current.append(ch);
            }
        }

        return current.toString();
    }
}