class Solution {
    public boolean isCircularSentence(String sentence) {
       String arr[]=sentence.split(" ");
       if(arr.length==1 && arr[0].charAt(0)!=arr[0].charAt(arr[0].length()-1))
       return false;
       for(int i=1;i<arr.length;i++){
        char c=arr[i].charAt(0);
        char d=arr[i-1].charAt(arr[i-1].length()-1);
        if(c!=d)
        return false;
       }
       if(sentence.charAt(0)!=sentence.charAt(sentence.length()-1))
       return false;
       return true;
    }
}