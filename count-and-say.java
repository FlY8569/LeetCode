class Solution {
    public String countAndSay(int n) {
        String s = "1";
        for (int k = 1; k < n; k++) {
            s += "#";
            String tmp = "";
            int count = 1;
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    count++;
                } else {
                    tmp = tmp + count + s.charAt(i);
                    count = 1;
                }
            }
            s = tmp;
        }
        return s;
    }
}