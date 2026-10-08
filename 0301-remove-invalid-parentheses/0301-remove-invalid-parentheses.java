class Solution {

    public List<String> removeInvalidParentheses(String s) {

        List<String> ans = new ArrayList<>();

        Queue<String> q = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        q.add(s);
        visited.add(s);

        boolean found = false;

        while (!q.isEmpty()) {

            String current = q.poll();

            // Check if current string is valid
            if (isValid(current)) {
                ans.add(current);
                found = true;
            }

            // If we already found valid answers,
            // don't remove more brackets
            if (found) {
                continue;
            }

            // Try removing every bracket
            for (int i = 0; i < current.length(); i++) {

                if (current.charAt(i) != '(' &&
                    current.charAt(i) != ')') {
                    continue;
                }

                String next =
                    current.substring(0, i) +
                    current.substring(i + 1);

                if (!visited.contains(next)) {
                    visited.add(next);
                    q.add(next);
                }
            }
        }

        return ans;
    }


    public boolean isValid(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(') {
                count++;
            }

            else if (ch == ')') {
                count--;
            }

            // More ')' than '('
            if (count < 0) {
                return false;
            }
        }

        // All '(' must also be closed
        return count == 0;
    }
}