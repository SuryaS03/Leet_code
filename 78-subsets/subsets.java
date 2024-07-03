class Solution {

public static void subSet(int ind,int[]nums,List<List<Integer>>res,List<Integer> cur){

res.add(new ArrayList<>(cur));
for(int i=ind;i<nums.length;i++){


    cur.add(nums[i]);
    subSet(i+1,nums,res,cur);
    cur.remove(cur.size()-1);

}


}


    public List<List<Integer>> subsets(int[] nums) {

List<List<Integer>> res=new ArrayList<>();
List<Integer> cur=new ArrayList<>();
int ind=0;
subSet(ind,nums,res,cur);
return res;
        
    }
}