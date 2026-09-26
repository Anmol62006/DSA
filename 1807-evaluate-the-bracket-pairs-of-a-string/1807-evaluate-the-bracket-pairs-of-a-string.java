class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {

        HashMap<String, String> map = new HashMap<>();

        // Knowledge ko HashMap me store karo
        for (List<String> pair : knowledge) {
            map.put(pair.get(0), pair.get(1));
        }

        StringBuilder ans = new StringBuilder();

        int i = 0;

        while (i < s.length()) {

            if (s.charAt(i) == '(') {

                i++; // '(' ko skip karo

                StringBuilder key = new StringBuilder();

                // ')' tak key collect karo
                while (s.charAt(i) != ')') {
                    key.append(s.charAt(i));
                    i++;
                }

                // Key ki value nikalo
                if (map.containsKey(key.toString())) {
                    ans.append(map.get(key.toString()));
                } else {
                    ans.append('?');
                }

                i++; // ')' ko skip karo

            } else {

                // Normal character
                ans.append(s.charAt(i));
                i++;
            }
        }

        return ans.toString();
    }
}