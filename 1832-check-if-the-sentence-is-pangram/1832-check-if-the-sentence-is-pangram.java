class Solution {
    public boolean checkIfPangram(String s) {
       int hash[]=new int[26];

       for(char ch : s.toCharArray()){
        int idx=ch-'a';
        hash[idx]=1;
       }
       int cnt = 0; 
        for(int i=0; i<26; i++){
            if(hash[i] == 1){
                cnt++;
            }
        }
        return cnt==26;
    }
}