class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        int m=0;
        if(mass>=100){
            m+=2;
        }
        long volume=(long)length*width*height;
        if(length>=10000 || width>=10000 || height>=10000 || mass>=10000 || volume>=1000000000){
            m+=1;
        }
        String str="";
        switch(m){
            case 0:
                str="Neither"; break;
            case 1:
                str="Bulky"; break;
            case 2:
                str="Heavy"; break;
            case 3:
                str="Both"; break;
        }
        return str;
    }
}
