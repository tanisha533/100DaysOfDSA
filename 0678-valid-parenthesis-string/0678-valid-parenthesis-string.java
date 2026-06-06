class Solution {
    public boolean checkValidString(String s) {
        int min=0,max=0;
        //TC- O(N) and SC- O(1)
        //range based sol
        for(int i=0; i<s.length(); i++){
            
            char ch=s.charAt(i);
            if(ch=='('){
                min++;
                max++;
            }
            else if(ch==')'){
                min--;
                max--;
            }
            else{
                //case of '*'
                min=min-1;
                max=max+1;
            }
            if(min<0)  min=0;
            if(max<0) return false;
        }
        return (min==0);
    }
}