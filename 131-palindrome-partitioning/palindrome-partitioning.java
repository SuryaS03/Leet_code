class Solution {
    static boolean ispalin(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    static void part(String s,int idx,List<String> cur,List<List<String>> ans)
    {
        if(idx==s.length())
        {
            ans.add(new ArrayList<>(cur));
            return;
        }
        for(int i=idx;i<s.length();i++)
        {
            if(ispalin(s.substring(idx,i+1)))
            {
                cur.add(s.substring(idx,i+1));
                part(s,i+1,cur,ans);
                cur.remove(cur.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> cur=new ArrayList<>();
        part(s,0,cur,ans);
        return ans;
        
    }
}