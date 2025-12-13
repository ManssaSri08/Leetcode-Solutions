class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> valid = new ArrayList<>();
        // Allowed categories
        Map<String, Integer> order = Map.of(
            "electronics", 0,
            "grocery", 1,
            "pharmacy", 2,
            "restaurant", 3
        );

        for (int i = 0; i < code.length; i++) {
            String c = code[i], b = businessLine[i];
            if (!isActive[i] || c.isEmpty() || !order.containsKey(b)) continue;

            boolean ok = true;
            for (char ch : c.toCharArray()) {
                if (!Character.isLetterOrDigit(ch) && ch != '_') {
                    ok = false;
                    break;
                }
            }
            if (ok) valid.add(b + "#" + c);
        }

        Collections.sort(valid, (a, b) -> {
            String[] A = a.split("#"), B = b.split("#");
            int cmpCat = order.get(A[0]) - order.get(B[0]);
            if (cmpCat != 0) return cmpCat;
            return A[1].compareTo(B[1]);
        });

        List<String> result = new ArrayList<>();
        for (String s : valid) {
            result.add(s.split("#")[1]);
        }
        return result;
    }
}

