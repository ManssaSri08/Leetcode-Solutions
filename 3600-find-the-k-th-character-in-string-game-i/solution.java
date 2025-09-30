class Solution {
    public char kthCharacter(int k) {
        int input=k-1;
        int one_bit_ctr=0;
        while(input>0)
        {
            if(input%2==1) one_bit_ctr++;
            input/=2;
        }
        return (char)('a'+one_bit_ctr);
    }
}
