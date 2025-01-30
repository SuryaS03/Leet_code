class Solution {

public static boolean compare(String a,String b){
    return (a+b).compareTo(b+a)<0;
}

    public String largestNumber(int[] nums) {
        List<String> li=new ArrayList<>();
        for(int i:nums){
            li.add(Integer.toString(i));
        }
        Collections.sort(li,(a,b)->compare(a,b)?1:-1);
        if(li.get(0).equals("0"))
        return "0";
        String s="";
        for(String sr:li)
        s=s+sr;
        return s;
    }
}