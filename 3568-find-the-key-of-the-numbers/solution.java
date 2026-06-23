class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int[] n1=new int[4];
        int[] n2=new int[4];
        int[] n3=new int[4];
        int j=3;
        while(num1>0){
            int rem=num1%10;
            n1[j--]=rem;
            num1/=10;
        }
        j=3;
        while(num2>0){
            int rem=num2%10;
            n2[j--]=rem;
            num2/=10;
        }
        j=3;
        while(num3>0){
            int rem=num3%10;
            n3[j--]=rem;
            num3/=10;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<4;i++){
            sb.append(Math.min(n1[i],Math.min(n2[i],n3[i])));
        }
        String n=sb.toString();
        return Integer.valueOf(n);
    }
}
