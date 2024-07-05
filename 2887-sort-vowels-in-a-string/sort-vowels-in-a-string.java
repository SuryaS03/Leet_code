class Solution {
    public String sortVowels(String s) {
        List <Character> li=new ArrayList<>();
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
    if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
        li.add(ch[i]);
        ch[i]='*';
    }
        }
        Collections.sort(li);
        int idx=0;
        for(int j=0;j<ch.length;j++){
            if(ch[j]=='*')
            ch[j]=li.get(idx++);
        }
return String.valueOf(ch);
        
    }
}