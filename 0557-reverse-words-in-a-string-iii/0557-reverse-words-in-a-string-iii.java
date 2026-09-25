class Solution {
    public String reverseWords(String s) {

        char[] word = s.toCharArray();

        int start = 0;

        for (int i = 0; i <= word.length; i++) {

            if (i == word.length || word[i] == ' ') {

                int end = i - 1;

                while (start < end) {

                    char temp = word[start];
                    word[start] = word[end];
                    word[end] = temp;

                    start++;
                    end--;
                }

                start = i + 1;
            }
        }

        return new String(word);
    }
}