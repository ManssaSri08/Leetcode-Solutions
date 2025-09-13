class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int num = 0;
        for (String op : operations) {
            if (op.charAt(1) == '+') 
                num++;
            else 
                num--;
        }
        return num;
    }
}

