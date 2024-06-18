class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        int arr[]=new int[26];
        int arr2[]=new int[26];
        for(char a:s.toCharArray()){
            arr[a-'a']++;
        }
          for(char b:t.toCharArray()){
            arr2[b-'a']++;
        }
        return Arrays.equals(arr,arr2);
        
    }
}