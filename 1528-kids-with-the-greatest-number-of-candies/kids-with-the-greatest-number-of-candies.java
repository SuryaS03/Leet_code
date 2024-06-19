class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new ArrayList<Boolean>();
        int len=candies.length;
        int max=0;
   
            for (int c : candies) {
            if (c > max) {
                max = c;
            }
        }
          for (int c : candies) {
            if ((c + extraCandies) >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }

        return list;
       
        
    }
}