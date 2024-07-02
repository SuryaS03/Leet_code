class Solution {
    public int distributeCandies(int[] candyType) {
        int len=candyType.length/2;
        HashSet <Integer>hs=new HashSet<>();
        for(int i:candyType)
        hs.add(i);
if(hs.size()<=len)
return hs.size();
return len;
    }
}