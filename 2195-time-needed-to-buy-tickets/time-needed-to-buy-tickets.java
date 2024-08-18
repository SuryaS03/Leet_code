class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        if(tickets[k]==0)
        return 0;
        int i=0;
        while(tickets[k]!=0){
            
            for(int j=0;j<tickets.length;j++){
              if(tickets[j]>0)
             { i++;
              tickets[j]--;
              if(tickets[k]==0)
              break;}
            }

        }
        return i;
        
    }
}