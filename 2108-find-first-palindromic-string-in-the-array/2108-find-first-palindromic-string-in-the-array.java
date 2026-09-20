class Solution {
    public String firstPalindrome(String[] words) {

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            int left = 0;
            int right = word.length() - 1;

            boolean palindrome = true;

            while (left < right) {

                if (word.charAt(left) != word.charAt(right)) {
                    palindrome = false;
                    break;
                }

                left++;
                right--;
            }

            if (palindrome) {
                return word;
            }
        }

        return "";
    }
}