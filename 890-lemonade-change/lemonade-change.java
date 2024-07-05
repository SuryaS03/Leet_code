class Solution {
    public boolean lemonadeChange(int[] bills) {
       List<Integer> li5=new ArrayList<>();
       List<Integer> li10=new ArrayList<>();
       for(int i:bills){
        if(i==5)
        li5.add(i);
        else if(i==10){
if(li5.size()<=0)
return false;
else{
    li10.add(i);
    li5.remove(0);
}

        }
        else{
            if(li10.size()>0 && li5.size()>0)
            {
                li5.remove(0);
                li10.remove(0);
            }
            else if(li5.size()>2)
            {
                li5.remove(0);
                li5.remove(0);
                li5.remove(0);
            }
            else
            return false;
        }
       }
       return true;

    }
}