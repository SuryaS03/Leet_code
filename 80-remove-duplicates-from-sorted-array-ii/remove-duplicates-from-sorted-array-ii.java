class Solution {
    public int removeDuplicates(int[] nums) {
        for(int i=0;i<nums.length;i++){
int key=nums[i];
int count=0;
for(int j=0;j<nums.length;j++){
if(nums[i]==nums[j])
count++;
if(count>2)
{nums[j]='_';
count--;
}
}

        }int res=0;
        Arrays.sort(nums);
        for(int l:nums){
            if(l!='_')
            res++;
        }
        return res;
    }
}