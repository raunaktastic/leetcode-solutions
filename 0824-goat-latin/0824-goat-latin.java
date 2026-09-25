class Solution {

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
            || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public String toGoatLatin(String sentence) {

        String[] words = sentence.split(" ");
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            // Consonant case
            if (!isVowel(word.charAt(0))) {
                word = word.substring(1) + word.charAt(0);
            }

            // Add "ma"
            res.append(word).append("ma");

            // Add 'a' i+1 times
            for (int j = 0; j <= i; j++) {
                res.append("a");
            }

            // Space between words
            if (i < words.length - 1) {
                res.append(" ");
            }
        }

        return res.toString();
    }
}