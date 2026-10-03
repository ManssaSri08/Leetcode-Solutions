/*
LeetCode: 929. Unique Email Addresses
Runtime: 13
Memory: 46264000
*/

class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set=new HashSet<>();
        for(String email:emails){
            String[] parts=email.split("@");
            String local=parts[0];
            String domain=parts[1];
            if(local.contains("+")){
                local=local.substring(0,local.indexOf("+"));
            }
            local=local.replace(".","");
            set.add(local+"@"+domain);
        }
        return set.size();
    }
}
