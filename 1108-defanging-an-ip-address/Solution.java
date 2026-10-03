/*
LeetCode: 1108. Defanging an IP Address
Runtime: N/A
Memory: 42564000
*/

class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}
