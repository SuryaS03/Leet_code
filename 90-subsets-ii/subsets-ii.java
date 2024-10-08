class Solution {


public static void solve(int[] nums,int idx,List<Integer> cur,List<List<Integer> >res){
if(res.size()>1){
    if(!res.contains(cur))
    res.add(new ArrayList(cur));
}else
res.add(new ArrayList(cur));

for(int i=idx;i<nums.length;i++){
    cur.add(nums[i]);
    solve(nums,i+1,cur,res);
    cur.remove(cur.size()-1);
}
}


    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> cur=new ArrayList<>();
        Arrays.sort(nums);
        solve(nums,0,cur,res);
        return res;

    }
}