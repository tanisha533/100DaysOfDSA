class Solution {
    public boolean canBeEqual(String s1, String s2) {
        
        return samegrp(s1,s2,0,2) && samegrp(s1,s2,1,3);
    }
   
    public boolean samegrp(String s1, String s2, int i,int j){
        char a1= s1.charAt(i), b1=s1.charAt(j);
        char a2= s2.charAt(i), b2=s2.charAt(j);

        return (a1==a2 && b1==b2) || (a1==b2 && b1==a2);
    }
}