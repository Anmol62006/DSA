class Solution {
    public boolean isValid(String s) {

        char[] Array = new char[s.length()];
        int UB = -1;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
               Array[++UB] = ch;
            }
            else {
                if (UB == -1)
                    return false;

                if (ch == ')' && Array[UB] != '(')
                    return false;

                if (ch == ']' && Array[UB] != '[')
                    return false;

                if (ch == '}' && Array[UB] != '{')
                    return false;

                UB--;
            }
        }

        return UB==-1;
    }
}