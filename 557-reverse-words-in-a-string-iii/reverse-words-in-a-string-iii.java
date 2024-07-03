class Solution {
    public String reverseWords(String s) {
        
String []arr=s.split(" ");
for(int i=0;i<arr.length;i++){
    StringBuilder sb=new StringBuilder(arr[i]);
    arr[i]=sb.reverse().toString();
}
String res="";
for(String str:arr){
res+=str+" ";
}
res=res.trim();
return res;

    }
}