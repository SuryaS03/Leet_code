class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
List<Integer> li=new ArrayList<>();
for(int i=left;i<=right;i++){
    if(i%10==0)
    continue;
    int n=i;
    int dig=0;
    int digit=(int)Math.log10(i)+1;
    while(n>0){
        int rem=n%10;
        if(rem!=0 && i%rem==0  )
        dig++;
        n/=10;
    }
    if(dig==digit)
    li.add(i);

}
return li;

    }
}