class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != '-') {
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
        }

        StringBuilder res = new StringBuilder();
        int count = 0;

        for (int i = 0; i < sb.length(); i++) {
            if (count == k) {
                res.append('-');
                count = 0;
            }
            res.append(sb.charAt(i));
            count++;
        }

        return res.reverse().toString();
    }
}
