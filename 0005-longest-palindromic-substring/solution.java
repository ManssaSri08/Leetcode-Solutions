class Solution {
    public String longestPalindrome(String s) {
        int size=(2*s.length())+1;
        char[] ch=new char[size];
        int[] count=new int[size];
        int j=0, max=0, end=0;
        ch[0]='$'; ch[size-1]='$';
        for(int i=0;i<size;i++){
            if(i%2==0) ch[i]='$';
            else ch[i]=s.charAt(j++);
        }
        for(int i=1;i<size-1;i++){
            int l=i-1, r=i+1;
            while(l>=0 && r<size && ch[l]==ch[r]){
                count[i]++;
                l--; r++;
            }
            if(count[i]>max){
                max=count[i];
                end=i;
            }
        }
        int start=(end-max)/2;
        return s.substring(start,start+max);
    }
}
