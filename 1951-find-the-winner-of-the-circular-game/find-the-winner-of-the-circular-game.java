class Solution {
    public int findTheWinner(int n, int k) {
       
      Queue<Integer> q=new LinkedList<>();
      for(int i=1;i<=n;i++){
        q.add(i);
      } 
      int c=1;
      while(q.size()!=1){
        if(c%k==0)
       { q.poll();
        c++;}
        else{
            // int x=q.peek();
            // q.poll();
            q.add(q.poll());
            c++;
        }
      }
      return q.peek();
    }
}