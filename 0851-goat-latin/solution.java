class Solution {
    public String toGoatLatin(String sentence) {
        String[] words=sentence.split(" ");
        StringBuilder result=new StringBuilder();
        for(int i=0;i<words.length;i++){
            if(isVowel(words[i].charAt(0))){
                result.append(words[i]);
                result.append("ma");
            }
            else if(!isVowel(words[i].charAt(0))){
                for(int j=1;j<words[i].length();j++){
                    result.append(words[i].charAt(j));
                }
                result.append(words[i].charAt(0));
                result.append("ma");
            }
            for(int k=1;k<=i+1;k++){
                result.append("a");
            }
            if(i<words.length-1){
                result.append(" ");    
            }
        }
        return result.toString();
    }
    public boolean isVowel(char ch){
        ch=Character.toLowerCase(ch);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') return true;
        else return false;
    }
}
