class Solution {
    public String reversePrefix(String word, char ch) {
        int endIndex=0;
        char[] arr=new char[word.length()];
        int index=0;

        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                endIndex=i;
                break;
            }
        }

        if(endIndex==0)
            return word;

        
        for(int i=endIndex;i>=0;i--){
            arr[index]=word.charAt(i);
            index++;
        }    

        for(int i= endIndex+1;i<word.length();i++){
            arr[index]=word.charAt(i);
            index++;
        }

        return new String(arr);
    }
}