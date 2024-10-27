import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static void perm(int[] nums, int idx, List<List<Integer>> res) {
        if (idx == nums.length) {
            Integer[] numsCopy = Arrays.stream(nums).boxed().toArray(Integer[]::new);
            res.add(new ArrayList<>(Arrays.asList(numsCopy)));
            return;
        }
        for (int i = idx; i < nums.length; i++) {
            swap(i, idx, nums);
            perm(nums, idx + 1, res);
            swap(i, idx, nums);
        }
    }

    public static void swap(int l, int r, int[] nums) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        perm(nums, 0, res);
        return res;
    }
}
